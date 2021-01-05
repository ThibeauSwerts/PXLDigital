package be.pxl.h3.exoef1;

import java.util.Random;
import java.util.Scanner;

public class berekening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("geef x:");
        int x = scanner.nextInt();
        scanner.close();

        Random rand = new Random();
        double y = rand.nextInt(6000) + 0.000;
        System.out.println("y: " + y);

        double resultaat = Math.E * Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        double afgerond = Math.round(resultaat * 1000.0) / 1000.0;
        System.out.println(afgerond);
    }
}
