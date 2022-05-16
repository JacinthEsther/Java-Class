package chapterFour;

import java.util.Scanner;

public class Cryptography {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("\"Enter four digits\"");
        int digit = input.nextInt();

        int firstDigit= ((digit / 1000) + 7)% 10;

        int secondDigit = (((digit % 1000)/100)  + 7) % 10;

        int thirdDigit = (((digit % 100)/ 10)  + 7) % 10;

        int fourthDigit = (((digit% 10))  + 7) % 10;

        int firstDigit2;
        int secondDigit2;
        int thirdDigit2;
        int fourthDigit2;

        firstDigit2 = thirdDigit;
        thirdDigit2 = firstDigit;
        secondDigit2 = fourthDigit;
        fourthDigit2 = secondDigit;

        System.out.print(firstDigit2);
        System.out.print(secondDigit2);
        System.out.print(thirdDigit2);
        System.out.print(fourthDigit2);





    }
}
