package be.pxl.h6.opdracht8;

import java.util.Locale;

public class FigurenApp {
    public static void main(String[] args) {
        Cirkel c1 = new Cirkel(5, 8, 10);
        Cirkel c2 = new Cirkel(5, 8, 10);
        System.out.println(GrafischElement.getAantal() + " figuren gemaakt");
        System.out.printf("omtrek: %.2f%n", c1.getOmtrek());
        System.out.printf("oppervlakte: %.2f%n", c1.getOppervlakte());
        System.out.println(c1);
        System.out.println(c1.toString());
        System.out.println(c1.equals(c2));


        GrafischElement[] vormen = new GrafischElement[6];
        vormen[0] = new Vierkant(5);
        vormen[1] = new Cirkel(8);
        vormen[2] = new Rechthoek(6, 9);
        vormen[3] = new Vierkant(7);
        vormen[4] = new Rechthoek(8, 2);
        vormen[5] = new Driehoek(4, 5, 10, 20, 3);
        for (GrafischElement vorm : vormen) {
            printVorm(vorm);
        }
    }

    private static void printVorm(GrafischElement vorm) {
        System.out.printf("Omtrek: %10.0f Oppervlakte: %10.0f %15S%n", vorm.getOmtrek(), vorm.getOppervlakte(), vorm.getClass().getSimpleName());
        // de %S doet .toUppercase() (ipv %s)
        if (vorm instanceof Cirkel) {
            Cirkel c = (Cirkel) vorm;
            System.out.println(c.getStraal());
            // of: System.out.println(((Cirkel) vorm).getStraal());
        }
    }
}
