package be.pxl.h8.voorbeeld;

import java.util.Scanner;

public class Integer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int b = java.lang.Integer.parseInt(a);
        b+=11;
        System.out.println(b);
        System.out.println(java.lang.Integer.SIZE);
        System.out.println(java.lang.Integer.BYTES);
    }
}
