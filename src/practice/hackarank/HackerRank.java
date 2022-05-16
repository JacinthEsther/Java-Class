package practice.hackarank;

import java.util.Scanner;

public class HackerRank {
    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
            int t=in.nextInt();
            for(int i=0;i<t;i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                for (int j = 1; j < n; j++) {
             int total = 0;
             int total1 = 0;
                    for (int k = 0; k < j; k++) {
                    total += ((int) Math.pow(2, k) * b);

                    total1 = a + total;
                    }
                    System.out.print(total1 + " ");
                }
                System.out.println();
            }
            in.close();
    }
}
