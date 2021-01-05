package be.pxl.h5.oef1;

public class Huwelijk {
    public Persoon man;
    public Persoon vrouw;
    public Datum huwelijksdatum;

    public Huwelijk(Persoon man, Persoon vrouw, int dag, int maand, int jaar) {
        this.man = man;
        this.vrouw = vrouw;
        this.huwelijksdatum = new Datum(dag, maand, jaar);
        vrouw.setAdres(man.getAdres());
        System.out.println(man.getVoornaam() + " " + man.getNaam() + " en " + vrouw.getVoornaam() + " " + vrouw.getNaam() + " zijn gehuwd op " + huwelijksdatum.datumToString());
    }


    public Persoon getMan() {
        return man;
    }

    public Persoon getVrouw() {
        return vrouw;
    }

    public Datum getHuwelijksdatum() {
        return huwelijksdatum;
    }



    public void adresWijziging(String straat, String huisNummer, int postcode, String gemeenteNaam) {
        Adres adres = new Adres(straat, huisNummer, postcode, gemeenteNaam);
        man.setAdres(adres);
        vrouw.setAdres(adres);
    }

    public void print() {
        System.out.println(man.toString() + "\ngeboren op " + man.getGeboortedatum().datumToString() + "\n\n" + vrouw.toString() + "\ngeboren op " + vrouw.getGeboortedatum().datumToString() + "\n\nHet huwelijk vond plaats op " + huwelijksdatum.datumToString());
    }
}
