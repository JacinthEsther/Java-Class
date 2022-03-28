package chapterFourteen;

import java.util.Scanner;

public class CompareTwoStrings {
    public static void main(String[] args) {
      compareTwoStrings();
    }

    private static void compareTwoStrings(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String firstWord = input.nextLine();
        System.out.println("Enter another word");
        String secondWord = input.nextLine();

        if(firstWord.compareTo(secondWord)< 0){
            System.out.println("FirstWord is less than secondWord");
        }
        else if(firstWord.compareTo(secondWord) == 0){
            System.out.println("FirstWord is equal to secondWord");
        }
        else System.out.println("FirstWord is greater than secondWord");

        System.out.printf(
                 "%ns1.compareTo(s2) is %d", firstWord.compareTo(secondWord));
    }

}
