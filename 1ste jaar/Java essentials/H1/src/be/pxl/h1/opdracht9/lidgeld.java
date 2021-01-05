package be.pxl.h1.opdracht9;

import java.util.Scanner;

public class lidgeld {
    public static void main(String[] args) {
        int huidig_jaar = 2020;

        Scanner scanner = new Scanner(System.in);
        System.out.println("geef leeftijd");
        int leeftijd = scanner.nextInt();
        scanner.nextLine();
        System.out.println("geef aansluitingsjaar");
        int aansluitingsjaar = scanner.nextInt();

        double lidgeld = 100;

        if (leeftijd < 21 || leeftijd > 60) {
            lidgeld -= 14.5;
        }

        int aantal_jaren = huidig_jaar - aansluitingsjaar;
        lidgeld -= aantal_jaren * 2.5;

        if (lidgeld < 62.5) {
            lidgeld = 62.5;
        }

        System.out.println("je betaalt " + lidgeld + " euro lidgeld");
        scanner.close();

    }
}
