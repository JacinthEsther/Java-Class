package practice;

import java.util.Arrays;

public class CloningArray {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7};
        int [] array2 = array.clone();
;
        System.out.println(Arrays.stream(array).sum()); ;
        System.out.println(Arrays.toString(array2));
    }
}
