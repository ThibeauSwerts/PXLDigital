package be.pxl.h6.voorbeeldPersoon;

public class Persoon {
    private String naam;
    private String voornaam;
    private static int aantal;

    public Persoon() {
        this("onbekend", "onbekend");
    }

    public Persoon(String naam, String voornaam) {
        setNaam(naam);
        setVoornaam(voornaam);
        aantal++;
    }


    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }



    public String getNaam() {
        return naam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public static int getAantal() {
        return aantal;
    }

    public void print() {
        System.out.println("naam: " + voornaam + " " + naam);
    }
}
