package be.pxl.h2.opdracht10;

public class Klas {
    private String naam;
    private int aantalStudenten;
    public static final int MAX_AANTAL = 40;
    private static int tel = 0;
    private static int totaalAantalStudenten;

    public Klas() {
        this("1TINx", 0);
    }

    public Klas(String naam, int aantalStudenten) {
        this.naam = naam;
        setAantalStudenten(aantalStudenten);
        tel++;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setAantalStudenten(int aantalStudenten) {
        totaalAantalStudenten -= this.aantalStudenten;

        if (aantalStudenten > MAX_AANTAL) {
            aantalStudenten = MAX_AANTAL;
        }
        this.aantalStudenten = aantalStudenten;
        // of
        // this.aantalStudenten = Math.min(aantalStudenten, MAX_AANTAL);

        totaalAantalStudenten += this.aantalStudenten;
    }

    public String getNaam() {
        return naam;
    }

    public int getAantalStudenten() {
        return aantalStudenten;
    }

    public static int getTel() {
        return tel;
    }

    public static int getTotaalAantalStudenten() {
        return totaalAantalStudenten;
    }
}
