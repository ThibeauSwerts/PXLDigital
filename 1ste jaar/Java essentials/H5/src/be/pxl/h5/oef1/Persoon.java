package be.pxl.h5.oef1;

public class Persoon {
    private String naam;
    private String voornaam;
    private Datum geboortedatum;
    private Adres adres;


    public Persoon(String naam, String voornaam, String straat, String huisNummer, int postcode, String gemeenteNaam, int dag, int maand, int jaar) {
        this(naam, voornaam, new Adres(straat, huisNummer, postcode, gemeenteNaam), new Datum(dag, maand, jaar));
    }

    public Persoon(String naam, String voornaam, Adres adres, Datum geboortedatum) {
        this.naam = naam;
        this.voornaam = voornaam;
        this.adres = adres;
        this.geboortedatum = geboortedatum;
    }



    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public void voegVoornamenToe(String[] nieuweVoornamen) {
        StringBuilder voornaamBuilder = new StringBuilder(voornaam);
        for (String naam : nieuweVoornamen) {
            voornaamBuilder.append(" ").append(naam);
        }
        this.voornaam = voornaamBuilder.toString();
    }



    public String getNaam() {
        return naam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public Adres getAdres() {
        return adres;
    }

    public Datum getGeboortedatum() {
        return geboortedatum;
    }


    public String toString() {
        return voornaam + " " + naam + "\n" + adres.toString();
    }
}
