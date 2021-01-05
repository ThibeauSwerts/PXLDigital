package be.pxl.h1.opdracht13;

public class array_2d {
    public static void main(String[] args) {
        int[][] matrix = new int[4][6];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = i * j;
            }
        }
        for (int[] row : matrix) {
            for (int el : row) {
                System.out.print(el + "\t");
            }
            System.out.println();
        }
    }
}
