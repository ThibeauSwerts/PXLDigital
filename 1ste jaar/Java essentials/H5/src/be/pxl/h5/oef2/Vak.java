package be.pxl.h5.oef2;

public class Vak {
    private String code;
    private String naam;
    private int aantalStudiepunten;

    public Vak(String code, String naam, int aantalStudiepunten) {
        setCode(code);
        this.naam = naam;
        setAantalStudiepunten(aantalStudiepunten);
    }


    public void setCode(String code) {
        if (controle(code)) {
            this.code = code;
        }
        else {
            this.code = code.charAt(0) + "1" + code.substring(2);
        }
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setAantalStudiepunten(int aantalStudiepunten) {
        if (aantalStudiepunten > 18) {
            aantalStudiepunten = 18;
        }
        if (aantalStudiepunten % 3 == 1) {
            aantalStudiepunten--;
        }
        if (aantalStudiepunten % 3 == 2) {
            aantalStudiepunten++;
        }
        this.aantalStudiepunten = aantalStudiepunten;
    }

    private boolean controle(String code) {
        return code.charAt(1) == '1' || code.charAt(1) == '2' || code.charAt(1) == '3';
    }

    public String getJaar() {
        return code.substring(1, 2);
    }




    public String getCode() {
        return code;
    }

    public String getNaam() {
        return naam;
    }

    public int getAantalStudiepunten() {
        return aantalStudiepunten;
    }
}
