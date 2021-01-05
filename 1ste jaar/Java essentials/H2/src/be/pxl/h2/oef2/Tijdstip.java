package be.pxl.h2.oef2;

public class Tijdstip {
    private int seconden;



    public Tijdstip(int uren, int minuten, int seconden) {
        setSeconden(uren * 3600 + minuten * 60 + seconden);
    }

    public Tijdstip(int seconden) {
        setSeconden(seconden);
    }

    public Tijdstip(Tijdstip kopie) {
        setSeconden(kopie.seconden);
    }




    public void setSeconden(int seconden) {
        if (seconden > 86399) {
            seconden %= 86399;
        }
        this.seconden = seconden;
    }

    public void wijzigUren(int uren) {
        setSeconden(uren * 3600);
    }

    public void wijzigMinuten(int minuten) {
        setSeconden(minuten * 60);
    }

    public void wijzigSeconden(int seconden) {
        setSeconden(seconden);
    }

    public int bepaalUren() {
        double deling = (double) seconden / 3600;
        return (int) Math.floor(deling);
    }

    public int bepaalMinuten() {
        int uren = bepaalUren();
        int enkelMinuten = seconden - uren * 3600;
        double deling = (double) enkelMinuten / 60;
        return (int) Math.floor(deling);
    }

    public int bepaalSeconden() {
        int minuten = bepaalMinuten();
        int uren = bepaalUren();
        return seconden - minuten * 60 - uren * 3600;
    }

    public void voegUrenToe(int uren) {
        seconden += uren * 3600;
    }

    public void voegMinutenToe(int minuten) {
        seconden += minuten * 60;
    }

    public void voegSecondenToe(int seconden) {
        this.seconden += seconden;
    }

    public void voegUrenToe() {
        voegUrenToe(1);
    }

    public String toStringTijd(boolean isTrue) {
        String tijd;
        if (isTrue) {
            int uren = bepaalUren();
            int uur = uren % 12;
            int minuten = bepaalMinuten();
            tijd = String.valueOf(uur) + ":" + String.valueOf(minuten);
            if (uren > 12) {
                tijd += " PM";
            }
            else {
                tijd += " AM";
            }
        }
        else {
            int uren = bepaalUren();
            int minuten = bepaalMinuten();
            tijd = String.valueOf(uren) + ":" + String.valueOf(minuten) + " u";
        }
        return tijd;
    }

/*    public String toStringTechnisch() {
        int uren = bepaalUren();
        if (uren < 10) {
            String uur = "0" + String.valueOf(uren);
        }
        else {
            String uur = String.valueOf(uren);
        }
        int minuten = bepaalMinuten();
        if (minuten < 10) {
            String minuut = "0" + String.valueOf(minuten);
        }
        else {
            String minuut = String.valueOf(minuten);
        }
        int seconden = bepaalSeconden();
        if (seconden < 10) {
            String seconde = "0" + String.valueOf(seconden);
        }
        else {
            String seconde = String.valueOf(seconden);
        }

        String resultaat = uur + ":" + minuut + ":" + seconde;
        return  resultaat;
    }*/
}

// wijzig()-methoden en toString()-methoden wss fout