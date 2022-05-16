package practice.hackarank;

import java.util.ArrayList;
import java.util.List;

public class Array1 {
    public static void main(String[] args) {
        List<Long> list = new ArrayList<>();
        list.add(1000000001L);
        list.add(1000000002L);
        list.add(1000000003L);
        list.add(1000000004L);
        list.add(1000000005L);
        System.out.println(aVeryBigSum(list));
                ;
//        1000000001 1000000002 1000000003 1000000004 1000000005
    }

        /*
         * Complete the 'simpleArraySum' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts INTEGER_ARRAY ar as parameter.
         */

    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        long total=0;
        for(long i = 0 ; i < ar.size(); i++ ){
            total+=ar.get(Math.toIntExact(i));
        }
        return total;
    }
}
