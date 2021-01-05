package be.pxl.h1.oef8;

import java.util.Scanner;

public class kolomSom {
    public static void main(String[] args) {
        int[][] tabel = new int[4][];
        tabel[0] = new int[3];
        tabel[1] = new int[3];
        tabel[2] = new int[3];
        tabel[3] = new int[3];

        int[] sommen = new int[3];

        Scanner scanner = new Scanner(System.in);

        for (int j = 0; j < tabel[0].length; j++) {
            int som = 0;
            for (int i = 0; i < tabel.length; i++) {
                System.out.println("geef ingave voor kolom " + j + ", rij " + i);
                tabel[i][j] = scanner.nextInt();
                scanner.nextLine();
                som += tabel[i][j];
            }
            sommen[j] = som;
        }
        System.out.println();

        System.out.println("tabel:");
        for (int i = 0; i < tabel.length; i++) {
            for (int j = 0; j < tabel[0].length; j++) {
                System.out.printf("%4d", tabel[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < sommen.length; i++) {
            int nummer = i + 1;
            System.out.println("som kolom " + nummer + " : " + sommen[i]);
        }
    }
}
