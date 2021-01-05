package be.pxl.h6.oef3;
import be.pxl.h6.voorbeeldPersoon.Persoon;

public class Sporter extends Persoon {
    private String sport;
    private static int tel;

    public Sporter(String naam, String voornaam) {
        this(naam, voornaam, "onbepaald");
    }

    public Sporter(String naam, String voornaam, String sport) {
        super(naam, voornaam);
        this.sport = sport;
        tel++;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public static int getTel() {
        return tel;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(sport);
    }
}
