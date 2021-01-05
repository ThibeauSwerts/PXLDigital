package be.pxl.h3.oef2;

public class Munt {
    private String naam;
    private double koers;
    private static final int AFRONDING = 3;
    private static int aantal;

    public Munt() {
        this("euro", 1);
    }

    public Munt(String naam, double koers) {
        this.naam = naam;
        this.koers = koers;
    }




    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setKoers(double koers) {
        this.koers = koers;
    }




    public String getNaam() {
        return naam.toUpperCase();
    }

    public double getKoers() {
        return Math.round(koers * 1000) /  (double) 1000;
    }

    public static int getAFRONDING() {
        return AFRONDING;
    }

    public static int getAantal() {
        return aantal;
    }
}
