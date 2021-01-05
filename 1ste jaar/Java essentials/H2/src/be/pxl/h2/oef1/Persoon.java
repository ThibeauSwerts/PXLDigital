package be.pxl.h2.oef1;

public class Persoon {
    private String voornaam;
    private String naam;
    private double lengte;
    private double gewicht;
    private int geboortejaar;


    public Persoon() {
        this("onbekend", "onbekend");
    }

    public Persoon(String voornaam, String naam) {
        this.voornaam = voornaam;
        this.naam = naam;
    }

    public Persoon(Persoon kopie) {
        this(kopie.voornaam, kopie.naam);
    }


    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public void voegVoornamenToe(String nieuweVoornamen) {
        this.voornaam += " " + nieuweVoornamen;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setLengte(double lengte) {
        if (lengte > 2.4) {
            lengte = 2.4;
        }
        this.lengte = lengte;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public void setGeboortejaar(int geboortejaar) {
        this.geboortejaar = geboortejaar;
    }




    public String getVoornaam() {
        return voornaam;
    }

    public String getNaam() {
        return naam;
    }

    public double getLengte() {
        return lengte;
    }

    public double getGewicht() {
        return gewicht;
    }

    public int getGeboortejaar() {
        return geboortejaar;
    }

    public int getLeeftijd() {
        return 2020 - geboortejaar;
    }




    public String infoToString() {
        String resultaat = String.format("Deze persoon is %s %s%n%-15s : %.2f%n%-15s : %.2f%n%-15s : %d%n",
                voornaam, naam, "gewicht", gewicht, "lengte", lengte, "geboortejaar", geboortejaar);
        return resultaat;
    }

    public double berekenBmi() {
        return gewicht / (lengte * lengte);
    }

    public String geefOmschriving(double bmi) {
        if (bmi < 18) {
            return "ondergewicht";
        }
        else if (bmi < 25) {
            return "normaal";
        }
        else if (bmi < 30) {
            return "overgewicht";
        }
        else if (bmi < 40) {
            return "obesitas";
        }
        else {
            return "morbide obesitas";
        }
    }

    public void groei() {
        setLengte(lengte + .01);
    }

    public void groei(int cm) {
        setLengte(lengte + (double) cm / 100);
    }


}
