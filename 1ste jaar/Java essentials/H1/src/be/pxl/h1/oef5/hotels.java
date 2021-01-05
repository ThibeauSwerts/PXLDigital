package be.pxl.h1.oef5;

import java.util.Scanner;

public class hotels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("aantal volwassenen:");
        int volwassenen = scanner.nextInt();
        scanner.nextLine();
        System.out.println("aantal kinderen:");
        int kinderen = scanner.nextInt();
        scanner.nextLine();

        System.out.println("hotelcode:");
        String hotelcode = scanner.nextLine();

        while (!hotelcode.equals("/")) {
            //inputs
            System.out.println("aantal sterren:");
            int sterren = scanner.nextInt();
            scanner.nextLine();
            System.out.println("kindercode A-Z:");
            char kindercode = scanner.nextLine().charAt(0);

            //prijs 1 volwassene
            double prijsVolwassene;
            if (sterren >= 4) {
                prijsVolwassene = 60;
            }
            else if (sterren == 3) {
                if (hotelcode.equals("BR") || hotelcode.equals("AN")) {
                    prijsVolwassene = 60;
                }
                else {
                    prijsVolwassene = 56;
                }
            }
            else if (hotelcode.equals("HI")) {
                prijsVolwassene = 70;
            }
            else {
                prijsVolwassene = 48;
            }

            //prijs 1 kind
            double prijsKind;
            if ((kindercode == 'A') && sterren <= 2 || hotelcode.equals("HA")) {
                prijsKind = 0;
            }
            else {
                prijsKind = .5 * prijsVolwassene;
            }

            //berekeningen
            double totalePrijs = volwassenen * prijsVolwassene + kinderen * prijsKind;

            //output
            System.out.print(hotelcode + " ");
            for (int i = 0; i < sterren; i++) {
                System.out.print("*");
            }
            System.out.println(" " + prijsVolwassene + " " + prijsKind + " " + totalePrijs);

            //loop herbeginnen
            System.out.println("hotelcode:");
            hotelcode = scanner.nextLine();
        }
        scanner.close();
    }
}
