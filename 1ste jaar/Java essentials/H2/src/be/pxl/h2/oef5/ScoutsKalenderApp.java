package be.pxl.h2.oef5;

import java.util.Scanner;

public class ScoutsKalenderApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("geef een maandnr in");
        int maand = scanner.nextInt();
        scanner.nextLine();
        System.out.println("geef een jaar in");
        int jaar = scanner.nextInt();
        scanner.nextLine();

        Datum[] data = new Datum[10];
        String[] activiteiten = new String[10];
        int i = 0; // teller om telkens het zelfde elementnr van de arrays in te vullen


        System.out.println("geef een dag in");
        int dag = scanner.nextInt();
        scanner.nextLine();
        while (dag != 0) {
            System.out.println("geef een activiteit in");
            String activiteit = scanner.nextLine();
            Datum datum = new Datum(dag, maand, jaar);
            data[i] = datum;
            activiteiten[i] = activiteit;

            i++;
            System.out.println("geef een dag in");
            dag = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("**** kalender voor " + maand + " " + jaar + " ****");
        for (int j = 0; j < 10; j++) {
            if (data[j] != null && activiteiten[j] != null) {
                System.out.printf("%-20s %-20s%n", data[j].datumToString(), activiteiten[j]);
            }
        }
    }
}
