package be.pxl.h7.oef2;

public class Kaart {
    private Ranking waarde;
    private Soort soort;


    public Kaart(Ranking waarde, Soort soort) {
        this.waarde = waarde;
        this.soort = soort;
    }


    public void setWaarde(Ranking waarde) {
        this.waarde = waarde;
    }

    public void setSoort(Soort soort) {
        this.soort = soort;
    }


    public Ranking getWaarde() {
        return waarde;
    }

    public Soort getSoort() {
        return soort;
    }


    @Override
    public String toString() {
        return soort + " " + waarde;
    }
}
