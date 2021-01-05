package be.pxl.h1.oef7;

import java.util.Scanner;

public class komenEten {
    public static void main(String[] args) {
        // aantal deelnemers opvragen
        Scanner scanner = new Scanner(System.in);
        System.out.println("geef het aantal deelnemers");
        int aantalDeelnemers = scanner.nextInt();
        scanner.nextLine();

        int[] punten = new int[aantalDeelnemers]; // lijst voor punten initialiseren

        // namenlijst maken
        String[] namen = new String[aantalDeelnemers];
        int deelnemer;
        for (int i = 0; i < aantalDeelnemers; i++) {
            deelnemer = i + 1;
            System.out.println("geef naam van deelnemer " + deelnemer);
            namen[i] = scanner.nextLine();
        }
        // punten ingeven
        for (int i = 0; i < namen.length; i++) {
            int punt;
            System.out.println("punten voor " + namen[i]);
            for (int j = 0; j < namen.length; j++) {
                if (i != j) { // deelnemer kan geen punten voor zichzelf geven
                    System.out.println(namen[j] + " geef uw punten voor SFEER");
                    punt = scanner.nextInt();
                    scanner.nextLine();
                    while (punt < 0 || punt > 10) {
                        System.out.println("Ongeldige punten!");
                        System.out.println(namen[j] + " geef uw punten voor SFEER");
                        punt = scanner.nextInt();
                        scanner.nextLine();
                    }
                    punten[i] += punt;

                    System.out.println(namen[j] + " geef uw punten voor ETEN");
                    punt = scanner.nextInt();
                    scanner.nextLine();
                    while (punt < 0 || punt > 10) {
                        System.out.println("Ongeldige punten!");
                        System.out.println(namen[j] + " geef uw punten voor ETEN");
                        punt = scanner.nextInt();
                        scanner.nextLine();
                    }
                    punten[i] += punt;
                }
            }
        }
        scanner.close();


        for (int i = 0; i < namen.length; i++) {
            System.out.println(namen[i] + " = " + punten[i]);
        }

        int hoogstePunt = punten[0];
        int positieHoogstePunt = 0;
        for (int i = 1; i < punten.length; i++) {
            if (punten[i] > hoogstePunt) {
                hoogstePunt = punten[i];
                positieHoogstePunt = i;
            }
        }
        System.out.println("winnaar: " + namen[positieHoogstePunt]);
    }
}
