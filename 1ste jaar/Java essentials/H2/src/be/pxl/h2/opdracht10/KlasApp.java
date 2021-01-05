package be.pxl.h2.opdracht10;

public class KlasApp {
    public static void main(String[] args) {
        Klas k1 = new Klas("1TING", 120);
        Klas k2 = new Klas("1TINH", 10);
        Klas k3 = new Klas("1TINI", 30);
        Klas k4 = new Klas();

        Klas[] klaslijst = {k1, k2, k3, k4};

        System.out.println(Klas.getTel() + " klassen");
        for (Klas klas : klaslijst) {
            System.out.printf("%s: %d studenten%n", klas.getNaam(), klas.getAantalStudenten());
        }

        System.out.println("totaal aantal studenten: " + Klas.getTotaalAantalStudenten());
        k3.setAantalStudenten(31);
        System.out.println("totaal aantal studenten: " + Klas.getTotaalAantalStudenten());

        double gemiddelde = (double) Klas.getTotaalAantalStudenten() / Klas.getTel();
        System.out.printf("gemiddelde: %.1f", gemiddelde);
    }
}
