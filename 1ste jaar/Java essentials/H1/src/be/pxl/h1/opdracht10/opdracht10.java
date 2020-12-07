package be.pxl.h1.opdracht10;

import java.util.Scanner;

public class opdracht10 {
    public static void main(String[] args)
    {
        int snelste_renner = -1;
        int snelste_tijd = 99999;
        int aantal_renners = 0;
        int trage_renners = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("geef nummer:");
        int nummer = scanner.nextInt();
        scanner.nextLine();

        while (nummer >= 0) {
            aantal_renners++;

            System.out.println("geef tijd in seconden:");
            int tijd = scanner.nextInt();
            scanner.nextLine();

            if (tijd < snelste_tijd)
            {
                snelste_tijd = tijd;
                snelste_renner = nummer;
            }
            if (tijd > 3600)
            {
                trage_renners++;
            }
            System.out.println("geef nummer:");
            nummer = scanner.nextInt();
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("snelste renner is renner " + snelste_renner);
        double percentage = (double) trage_renners / aantal_renners * 100;
        System.out.println("percentage renners dat er langer als 1u over doet is " + percentage + "%");
    }
}
