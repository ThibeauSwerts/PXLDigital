package be.pxl.h1.oef2;

import java.util.Scanner;

public class voeballers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("naam speler:");
        String naam = scanner.nextLine();

        System.out.println("prijs vorig seizoen:");
        double oudePrijs = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("leeftijd:");
        int leeftijd = scanner.nextInt();
        scanner.nextLine();

        System.out.println("gemiddeld beoordelingscijfer van de sportjournalisten (cijfer tussen 0 en 10)");
        int cijfer = scanner.nextInt();
        scanner.nextLine();

        System.out.println("type speler: \"Aanvaller\", \"Middenvelder\", \"Verdediger\", \"Doelman\"");
        String typeSpeler = scanner.nextLine();

        System.out.println("aantal doelpunten");
        int aantalDoelpunten = scanner.nextInt();
        scanner.nextLine();

        scanner.close();

        double prijs = oudePrijs;

        if (leeftijd < 25) {
            prijs *= 1.1;
        }
        else if (leeftijd > 30) {
            prijs *= .9;
        }
        if (typeSpeler.equals("Aanvaller")) {
            if (aantalDoelpunten <= 5) {
                prijs += aantalDoelpunten * 10000;
            }
            else {
                prijs += 5 * 10000 + (aantalDoelpunten - 5) * 20000;
            }
        }
        if (typeSpeler.equals("Middenvelder") || typeSpeler.equals("Verdediger")) {
            prijs += cijfer * 10000;
        }
        else if (typeSpeler.equals("Doelman")) {
            prijs += cijfer * 10000;
            if (aantalDoelpunten > 20) {
                prijs -= (aantalDoelpunten - 19) * 9000;
            }
        }

        System.out.println(naam + " kostte vorig seizoen " + oudePrijs + " en kost nu " + prijs);


    }

}
