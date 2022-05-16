package practice;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax {

    public static int[] minMax(int firstNumber, int secondNumber, int thirdNumber){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        if (firstNumber > max) {
            max = firstNumber;
        }
        if (firstNumber < min){
            min = firstNumber;
        }
        if (secondNumber > max){
            max = firstNumber;
        }
        if (secondNumber < min){
            min = secondNumber;
        }
        if (thirdNumber > max){
            max = thirdNumber;
        }
        if (thirdNumber < min){
            min = thirdNumber;
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        int[] result = minMax(5, 7, 9);
        System.out.println(Arrays.toString(result));
    }

}
