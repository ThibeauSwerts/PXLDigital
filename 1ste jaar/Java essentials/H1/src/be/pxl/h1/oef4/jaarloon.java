package be.pxl.h1.oef4;

import java.util.Scanner;

public class jaarloon {
    public static void main(String[] args) {
        int goedeVerkopers = 0;
        int aantalVerkopers = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("nummer vertegenwoordiger (4 cijfers):");
        int nummer = scanner.nextInt();
        scanner.nextLine();

        while (nummer < 9000) {
            System.out.println("verkochte bedrag:");
            double bedrag = scanner.nextDouble();
            scanner.nextLine();

            aantalVerkopers += 1;

            double loon = 25000;

            if (bedrag < 50000) {
                loon += loon * .05;
            }
            else if (50000 <= bedrag && bedrag < 75000) {
                loon += loon * .1;
            }
            else {
                loon += loon * .15;
                goedeVerkopers += 1;
            }
            System.out.println("verkoper: " + nummer + "\nverkochte bedrag: " + bedrag + "\nloon:" + loon);
            System.out.println("\nnummer vertegenwoordiger (4 cijfers):");
            nummer = scanner.nextInt();
            scanner.nextLine();
        }
        scanner.close();
        double percentage = (double) goedeVerkopers / aantalVerkopers * 100;
        System.out.println(percentage + "% van de verkopers verkocht voor >75000");
    }
}
