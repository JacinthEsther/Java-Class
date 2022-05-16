package chapterTwo;

import java.util.Scanner;
public class Multiples{
    public static void main(String [] args){
        Scanner number= new Scanner(System.in);

        System.out.println("Enter first number");
        int firstNumber = number.nextInt();

        System.out.println("Enter second number");
        int secondNumber = number.nextInt();



        int thirdNumber= (secondNumber % firstNumber);
        if (thirdNumber == 0)

            System.out.printf( "%d is a multiple of the %d", firstNumber, secondNumber);

        else System.out.printf( "%d is not a multiple of the %d", firstNumber, secondNumber);

    }
}
