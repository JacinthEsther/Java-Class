package chapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class  MultiplicationQuiz2 {
    private static final SecureRandom input = new SecureRandom();
       private static final Scanner check = new Scanner(System.in);
    public static void main(String[] args) {
        multiplicationQuiz();

    }
    private static void printCorrectResponse(){
        int correctResponse = 1 + input.nextInt(4);
        switch (correctResponse){
            case 1 -> System.out.println("Very good!");
            case 2 -> System.out.println("Excellent!");
            case 3 -> System.out.println("Nice work!");
            case 4 -> System.out.println("Keep up the good work!");
        }
    }

    private static void incorrectResponse() {
        int incorrectResponse = 1 + input.nextInt(4);
        switch (incorrectResponse){
            case 1 -> System.out.println("No. Please try again.");
            case 2 -> System.out.println("Wrong. Try once more.");
            case 3 -> System.out.println("Don't give up!");
            case 4 -> System.out.println("No. Keep trying.");
        }
    }

    private static void multiplicationQuiz() {
     //   SecureRandom output = new SecureRandom();
        int output1 = 1 + input.nextInt(12);
        int output2 = 1 + input.nextInt(12);
        int userAnswer = 0;
        int result = output1 * output2;
        System.out.println(output1 + " times " + output2);
        while (userAnswer != -1) {
            userAnswer = check.nextInt();
            if (userAnswer == result) {
                printCorrectResponse();
                promptUserForMoreQuestion();
            }
            else {
                incorrectResponse();
            }
       }

    }
    private static void promptUserForMoreQuestion(){
        System.out.println("press 1 to continue and 2 to end game");
        int response = check.nextInt();
        if (response == 1){
            multiplicationQuiz();
        }
        else System.exit(0);
    }
}
