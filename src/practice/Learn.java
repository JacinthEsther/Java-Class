package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Learn {
    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 3; j++) {
//                for (int k = 1; k <= 4; k++)
//                    System.out.print('*');
//                System.out.println();
//            }
//            System.out.println();
//        }

        int [] [] position = new int[8][8];
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter row");
        int row = scanner.nextInt();
        System.out.println("enter column");
        int column = scanner.nextInt();

        int count = 0;
        position[row-1][column-1] = 1;
//        }
        for (int i = 0; i < position.length; i++) {
            for (int j = 0; j < position[i].length; j++){
                System.out.print(position[i][j] + " ");
            }
            System.out.println();
        }

    }
}
