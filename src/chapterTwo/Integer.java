package chapterTwo;

import java.util.Scanner;
public class Integer{

    public static void main(String... args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter five digits");
        int digit = input.nextInt();


        int firstDigit= (digit / 10000);
        System.out.println(firstDigit);
        int secondDigit = (digit % 10000)/1000;
        System.out.println(secondDigit);
        int thirdDigit = (digit % 1000)/ 100;
        System.out.println(thirdDigit);
        int fourthDigit = (digit% 100)/ 10;
        System.out.println(fourthDigit);
        int fifthDigit=(digit % 10);
        System.out.println(fifthDigit);

        System.out.printf("%d  %d  %d  %d  %d", firstDigit, secondDigit, thirdDigit, fourthDigit, fifthDigit);

    }
}
