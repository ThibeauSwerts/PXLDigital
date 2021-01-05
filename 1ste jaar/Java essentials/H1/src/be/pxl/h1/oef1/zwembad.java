package be.pxl.h1.oef1;

import java.util.Scanner;

public class zwembad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lengte:");
        double lengte = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("breedte:");
        double breedte = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("diepte:");
        double diepte = scanner.nextDouble();
        scanner.nextLine();
        scanner.close();

        double inhoud = lengte * breedte * diepte;

        System.out.println("voor dit zwembad te vullen heb je " + inhoud * .98 + "l water nodig, en " + .02 * inhoud + "l ontsmettingsmiddel nodig");
    }
}
