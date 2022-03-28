package chapterFourteen;

import java.util.Scanner;

public class TextAnalysisB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("type your sentence here");
        String []sentence = scanner.nextLine().split(" ");
        for (int i = 0; i < sentence.length; i++) {
        int count = 0;
            for (int j = 0; j < sentence[i].length(); j++) {

                count++;
            }
            System.out.println( "word "+ (i+1)+" is "+count);
        }


    }
}
