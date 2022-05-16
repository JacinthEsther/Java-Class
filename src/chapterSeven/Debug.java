package chapterSeven;

import java.util.Arrays;
import java.util.Optional;
import java.util.StringTokenizer;

public class Debug {
    public static void main(String[] args) {
        int[][] intMatrix = {
                {1, 1, 1, 1, 1},
                {2, 4, 6, 8, 0},
                {9, 8, 7, 6, 5}
        };

        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < intMatrix[i].length; j++) {

                    System.out.println(intMatrix[i][j]);
            }
        }
        intMatrix[1][1]= 0;
        System.out.println(Arrays.deepToString(intMatrix));
        String line1 = new String("c = 1 + 2 + 3") ;
        StringTokenizer tok = new StringTokenizer(line1);
        int count = tok.countTokens();
        System.out.println(count);

    }
}
