package chapterSeventeen;

import java.security.SecureRandom;
import java.util.Arrays;

public class RandomNumbers {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();
        System.out.println( "The sum of 100 random numbers between 1 and 25 is "+
                randomNumbers.ints(100,1,25)
                    .sum());
        displayUniqueWords("Let's get it done and let's make a great day");

    }
    public static void displayUniqueWords(String sentence){
        sentence = sentence.toLowerCase();
        Arrays.stream(sentence.split(" "))
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}
