package chapterSeven;

import java.security.SecureRandom;


public class DieRolling {
    public static void main(String[] args) {
        int [] dice = new int [13];
        SecureRandom random = new SecureRandom();
        for (int i = 1; i <= 36000000; i++) {
            int die1 = 1 + random.nextInt(6);
            int die2 = 1 + random.nextInt(6);
            dice[die1 + die2]++;
        }
        System.out.println("s/n\tfrequency\tpercentage");
        for (int i = 2; i < dice.length; i++) {
            int percent = dice[i]/360000;
            System.out.printf("%d\t%d\t\t\t%d\n", i,dice[i],percent ) ;
        }
    }
}
