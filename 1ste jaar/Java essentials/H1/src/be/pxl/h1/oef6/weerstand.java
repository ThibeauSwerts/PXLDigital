package be.pxl.h1.oef6;

import java.util.Scanner;

public class weerstand {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] karakters = {'z', 'b', 'r', 'o', 'g', 'G', 'B', 'V', 'L', 'W'};
        char[] codes = new char[3];
        int[] waarden = {-1, -1, -1};

        System.out.println("Geef het eerste karakter");
        codes[0] = scanner.nextLine().charAt(0);

        System.out.println("Geef het tweede karakter");
        codes[1] = scanner.nextLine().charAt(0);

        System.out.println("Geef het derde karakter");
        codes[2] = scanner.nextLine().charAt(0);

        for (int i = 0; i < codes.length; i++) {
            for (int j = 0; j < karakters.length; j++) {
                if (codes[i] == karakters[j]) {
                    waarden[i] = j;
                }
            }
        }

        boolean geldig = true;
        for (int w : waarden) {
            if (w == -1) {
                geldig = false;
            }
        }

        if (geldig) {
            double r = (10 * waarden[0] + waarden[1]) * Math.pow(10, waarden[2]);
            System.out.println("Resultaat: " + r);
        } else {
            System.out.println("Ongeldige waarde gevonden...");
        }
    }
}
