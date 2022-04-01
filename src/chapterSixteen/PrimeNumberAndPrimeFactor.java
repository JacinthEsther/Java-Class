package chapterSixteen;

import java.util.HashSet;

import java.util.Set;

public class PrimeNumberAndPrimeFactor {
    public static void main(String[] args) {
        System.out.println(returnPrimeFactors(54));
    }

    public static boolean isPrime(int number) {
        if (number == 1) return true;
        int count = 2;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0 && number / i >= i) {
                count += 2;
            }
        }
        return count == 2;
    }

    public static Set<Integer> returnPrimeFactors(int number) {

        Set<Integer> primeFactors = new HashSet<>();
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                if (isPrime(i)) {
                    primeFactors.add((i));
                    returnPrimeFactors(number/i);
                }
            }

        }
        if(primeFactors.size()==0){
            return  Set.of(1,number);
        }
            return primeFactors;
    }
}
