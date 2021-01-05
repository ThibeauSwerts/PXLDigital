package be.pxl.h5.opdracht;

public class Boek {
    private String isbn;
    private String titel;
    private int bladzijden;
    private Auteur auteur;

    public Boek() {
        this("", "",0, new Auteur("onbekend", "onbekend"));
    }

    public Boek(String isbn, String titel, int bladzijden, Auteur auteur) {
        this.isbn = isbn;
        this.titel = titel;
        this.bladzijden = bladzijden;
        this.auteur = auteur;
    }


    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setBladzijden(int bladzijden) {
        this.bladzijden = bladzijden;
    }

    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }



    public String getIsbn() {
        return isbn;
    }

    public String getTitel() {
        return titel;
    }

    public int getBladzijden() {
        return bladzijden;
    }

    public Auteur getAuteur() {
        return auteur;
    }



    public void toonBoekGegevens() {
        System.out.printf("%-16s %15s%n%-16s %15s%n%-16s %15d%n%-25s%n",
                "ISBN:", isbn, "Titel:", titel, "Bladijden:", bladzijden, auteur.toString());
        System.out.println();
    }
}
