package chapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class Quiz {
    static SecureRandom randomGenerator = new SecureRandom();
    static int pass =0;
    static int fail =0;
    static int x ;
    static int y;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
                int render = 1+ randomGenerator.nextInt(4);
            switch(render){
                case 1 -> addition();
                case 2 -> multiplication();
                case 3 -> division();
                case 4 -> subtraction();
            }
        }
        System.out.println("you passed "+ pass);
        System.out.println("you failed "+ fail);
    }

private static void generateRandomNumbers(){
    x = 1+ randomGenerator.nextInt(10);
    y = 1+ randomGenerator.nextInt(10);
}
    public static void addition(){
        generateRandomNumbers();

       double result= x+y;

        System.out.print(x +" + " +y+ " = ");
        collateUser(result);
    }
     public static void division(){
         generateRandomNumbers();


         double result= x*1.0 /y;

        System.out.print(x +" / " +y+ " = ");
         collateUser(result);
     }
     public static void subtraction(){
         generateRandomNumbers();


         double result= x-y;

        System.out.print(x +" - " +y+ " = ");
         collateUser(result);
     }
     public static void multiplication(){
         generateRandomNumbers();


         double result= x*y;

        System.out.print(x +" * " +y+ " = ");
         collateUser(result);
     }

    private static void collateUser(double result) {
        double userAnswer = getUserAnswer();
        if (result == userAnswer) pass++;
        else fail++;
    }

    private static int getUserAnswer() {
        return scanner.nextInt();
    }

}
