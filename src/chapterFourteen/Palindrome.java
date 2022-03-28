package chapterFourteen;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scanner.nextLine();

        StringBuilder builder = new StringBuilder(word);
        if(word.equals(builder.reverse().toString())){
            System.out.println("This is a palindrome");
        }
        else System.out.println("This is not a palindrome");
    }
}
