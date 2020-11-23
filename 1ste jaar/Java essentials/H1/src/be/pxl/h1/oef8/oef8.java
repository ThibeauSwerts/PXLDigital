package be.pxl.h1.oef8;
import java.util.Scanner;

public class oef8
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] array = new int[3][4];

        for (int i = 0; i < array.length; i++) {
            int columnSum = 0;
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = scanner.nextInt();
                scanner.nextLine();
                columnSum += array[i][j];
            }
            System.out.println("Column sum: " + columnSum);
        }
    }
}
