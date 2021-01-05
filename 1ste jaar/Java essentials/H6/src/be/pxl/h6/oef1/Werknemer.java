package be.pxl.h6.oef1;

import be.pxl.h6.voorbeeldPersoon.Persoon;

public class Werknemer extends Persoon {
    private String functie;
    private int salaris;
    private static final int MINIMUM_SALARIS = 1000;
    private static int tel;

    public Werknemer(String naam, String voornaam) {
        this(naam,voornaam, "algemeen bediende", 1800);
    }


    public Werknemer(String naam, String voornaam, String functie, int salaris) {
        super(naam, voornaam);
        setFunctie(functie);
        setSalaris(salaris);
        tel++;
    }


    public void setFunctie(String functie) {
        this.functie = functie;
    }

    public void setSalaris(int salaris) {
        this.salaris = Math.max(salaris, MINIMUM_SALARIS);
    }



    public String getFunctie() {
        return functie;
    }

    public int getSalaris() {
        return salaris;
    }

    public static int getTel() {
        return tel;
    }



    @Override
    public void print() {
        super.print();
        System.out.printf("%-10s %15s%n%-10s %15d%n", "Functie:", getFunctie(), "Salaris:", getSalaris());
    }
}
