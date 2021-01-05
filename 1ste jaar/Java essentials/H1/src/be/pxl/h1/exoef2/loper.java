package be.pxl.h1.exoef2;

import java.util.Scanner;

public class loper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("geef de begintijd in seconden in");
        int tijd = scanner.nextInt();
        scanner.close();

        System.out.println("verwachte looptijden voor volgende 30 jaar");
        for (int i = 1; i <= 30; i++) {
            if (i < 4) {
                tijd *= .95;
            }
            else if (i < 7) {
                tijd *= .96;
            }
            else if (i < 10) {
                tijd *= .97;
            }
            else if (i < 13) {
                tijd *= .98;
            }
            else if (i < 16) {
                tijd *= .99;
            }
            else if (i < 19) {
                tijd = tijd;
            }
            else {
                tijd *= 1.02;
            }
            System.out.println("jaar " + i + " : " + tijd + " seconden");
        }
    }
}
