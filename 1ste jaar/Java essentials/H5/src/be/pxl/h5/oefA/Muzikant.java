package be.pxl.h5.oefA;

public class Muzikant {
    private String naam;
    private Instrument instrument;


    public Muzikant(String naam, Instrument instrument) {
        this.naam = naam;
        this.instrument = instrument;
    }


    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }


    public void speel() {
        instrument.speel();
    }

    public String toString() {
        return naam + " [" + instrument.toString() + "]";
    }
}
