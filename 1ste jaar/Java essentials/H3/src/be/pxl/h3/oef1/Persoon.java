package be.pxl.h3.oef1;

import java.util.Locale;

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
        StringBuilder voornaamBuilder = new StringBuilder();
        voornaamBuilder.append(voornaam).append(" ").append(nieuweVoornamen);
        this.voornaam = voornaamBuilder.toString();
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
        StringBuilder voornaamNaam = new StringBuilder();
        voornaamNaam.append(voornaam.toUpperCase()).append(" ").append(naam.toUpperCase());
        String resultaat = String.format("Deze persoon is %s %n%-15s : %.2f%n%-15s : %.2f%n%-15s : %d%n",
                voornaamNaam, "gewicht", gewicht, "lengte", lengte, "geboortejaar", geboortejaar);
        return resultaat;
    }

    public double berekenBmi() {
        double bmi = gewicht / (lengte * lengte);
        return Math.round(bmi * 10) / 10.0;
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

    public String geefNaamAfgekort() {
        return voornaam.substring(0, 1).toUpperCase() + "." + naam.substring(0, 1).toUpperCase() + naam.substring(1) ;
    }

    public String geefInitiaal() {
        char eersteNaam = naam.charAt(0);
        if (Character.isUpperCase(eersteNaam)) {
            return naam.substring(0, 2).toUpperCase() + voornaam.substring(0, 2).toUpperCase();
        }
        else {
            return naam.substring(0, 2).toLowerCase() + voornaam.substring(0, 2).toLowerCase();
        }
        // extra niet gedaan
    }

    // encrypteerNaam() onduidelijk
}
