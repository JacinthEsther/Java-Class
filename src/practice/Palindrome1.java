package practice;

public class Palindrome1 {

   private int firstDigit;
    private int secondDigit;
    private int thirdDigit;
    private int fourthDigit;
    private int fifthDigit;
    public void setDigit(int number) {
         firstDigit = number/10000;
         secondDigit = number % 10000/1000;
         thirdDigit = number % 1000/100;
         fourthDigit = number % 100/10;
         fifthDigit = number % 10;
    }

    public int getDigit() {
        return Integer.parseInt(firstDigit + ""+ secondDigit + ""+ thirdDigit + ""+ fourthDigit + ""
                + fifthDigit);
    }

    public boolean checkPalindrome(int number) {
        setDigit(number);
        return firstDigit == fifthDigit && secondDigit == fourthDigit;
    }


    public boolean checkStringNumbers(String numbers) {
            if(numbers.length()== 5) {
        for (int i = 0; i <numbers.length(); i++){
                if (numbers.charAt(0) == numbers.charAt(numbers.length() - 1) &&
                        numbers.charAt(1) == numbers.charAt(numbers.length() - 2)) {
                    return true;

                }
            }

        }
            else System.out.println("Invalid number length");
        return false;
    }

}
