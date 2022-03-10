public class Matrix {
    public static void main(String[] args) {
        int[][] array = {{7, 9, 1}, {0, 7, 9}};

        for (int i = 0; i < array.length+1; i++) {
            for (int j = 0; j < array[i].length+1; j++) {

                if (array[i][j] == array[i+1][j+1]){
                    System.out.println(array[i][j]);
                }
                if (array[j].length > array.length) break;
            }
        }
    }
}
