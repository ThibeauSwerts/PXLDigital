package be.pxl.h5.oef1;

public class Adres {
    private String straat;
    private String huisNummer;
    private Gemeente gemeente;

    public Adres(String straat, String huisNummer, int postcode, String gemeenteNaam) {
        this.straat = straat;
        this.huisNummer = huisNummer;
        this.gemeente = new Gemeente(postcode, gemeenteNaam);
    }


    public void setStraat(String straat) {
        this.straat = straat;
    }

    public void setHuisNummer(String huisNummer) {
        this.huisNummer = huisNummer;
    }



    public String getStraat() {
        return straat;
    }

    public String getHuisNummer() {
        return huisNummer;
    }

    public Gemeente getGemeente() {
        return gemeente;
    }


    public String toString() {
        return straat + " " + huisNummer + "\n" + gemeente.toString();
    }
}
