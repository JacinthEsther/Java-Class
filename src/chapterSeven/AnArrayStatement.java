package chapterSeven;

import java.util.Arrays;

public class AnArrayStatement {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,10,0,0,0,0,0,0,0,0,0,0};
    int newSum;
        for (int i = 0; i < 10; i++) {

               newSum = array[i]* 2;
               array[10+i] = newSum;
            System.out.println(array[10+i]);
        }

        System.out.println(Arrays.toString(array));
    }
}
