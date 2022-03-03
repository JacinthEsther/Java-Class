package assignment;

import java.util.Scanner;

public class LedLight {
   private static final int [] [] array = new int [5][4];

    public static void main(String[] args) {
        userInput();
        outputArray(array);
    }
    public static void userInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter eight digits in 0's and 1's");
        String digit = input.nextLine();
        Integer.parseInt(digit);
         if (digit.length() == 8) {
            int firstDigit = (Integer.parseInt(digit) / 10000000);
            int secondDigit = (Integer.parseInt(digit) % 10000000) / 1000000;
            int thirdDigit = (Integer.parseInt(digit) % 1000000) / 100000;
            int fourthDigit = (Integer.parseInt(digit) % 100000) / 10000;
            int fifthDigit = (Integer.parseInt(digit) % 10000) / 1000;
            int sixthDigit = (Integer.parseInt(digit) % 1000) / 100;
            int seventhDigit = (Integer.parseInt(digit) % 100) / 10;
            int eighthDigit = (Integer.parseInt(digit) % 10);

            if (eighthDigit == 1) {
                if (firstDigit == 1) {
                    displayA();
                }
                if (secondDigit == 1) {
                    displayB();
                }
                if (thirdDigit == 1) {
                    displayC();
                }
                if (fourthDigit == 1) {
                    displayD();
                }
                if (fifthDigit == 1) {
                    displayE();
                }
                if (sixthDigit == 1) {
                    displayF();
                }
                if (seventhDigit == 1) {
                    displayG();
                } else System.out.println("  ");
            } else System.exit(0);
        }
        else {
            System.out.println("invalid digit");
            userInput();
        }
    }



    public static void outputArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 0){
                    System.out.print(" ");
                }else if (array[i][j] ==1){
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }

    public static void displayA(){
        for(int i = 0; i< 1 ; i++){
            for(int j = 0; j < 4; j++){
                array[i][j] = 1;
            }
        }

    }
    public static void displayB(){
        for(int i = 0; i< 3 ; i++){
            for(int j = 3; j < 4; j++){
                array[i][j] = 1;
            }
        }
    }
    public static void displayC() {
        for(int i = 2; i< 5 ; i++){
            for(int j = 3; j < 4; j++){
                array[i][j] = 1;
            }
        }
    }
    public static void displayD() {

        for(int i = 4; i< 5 ; i++){
            for(int j = 0; j < 4; j++){
                array[i][j] = 1;
            }
        }
    }
    public static void displayE() {

        for(int i = 2; i< 5 ; i++){
            for(int j = 0; j < 1; j++){
                array[i][j] = 1;
            }
        }

    }
     public static void displayF() {

         for(int i = 0; i< 3 ; i++){
             for(int j = 0; j < 1; j++){
                 array[i][j] = 1;
             }
         }
    }
    public static void displayG() {
        for(int i = 2; i < 3 ; i++){
            for(int j = 0; j < 4; j++){
                array[i][j] = 1;
            }
        }

    }

}
