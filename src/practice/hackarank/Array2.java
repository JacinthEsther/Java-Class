package practice.hackarank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Array2 {

    public static void main(String[] args) {
//        System.out.println(diagonalDifference(list));

    }
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code hereint diagonalSum(List<List<Integer>> matrix) {
        int n = arr.size();
        int d1 = 0 ;
        int d2 =0;
        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                if( i == j){
                    d1 += arr.get(i).get(j);
                }
                if(i == n-j-1){
                    d2 += arr.get(i).get(j);
                }
            }
        }
        return Math.abs(d1-d2);

//            return IntStream.range(0, n)
//                .map(i -> i < arr.get(i).size() ? arr.get(i).get(i) : 0)
//                .sum();

}
//        System.out.println(arr);
//        return arr;


}
