package be.pxl.h3.oef3;

public class Bewerkingen {

    public String trekAf(double a, double b) {
        String bewerking;
        a = Math.round(a * 100) / (double) 100;
        b = Math.round(b * 100) / (double) 100;
        if (b < 0) {
            bewerking = String.valueOf(a) + " + " + String.valueOf(b).substring(1) + " = ";
        }
        else {
            bewerking = String.valueOf(a) + " - " + String.valueOf(b) + " = ";
        }
        double c = Math.round((a - b) * 100) / (double) 100;
        String resultaat = String.valueOf(c);
        return bewerking + resultaat;
    }

    public String trekAf(int a, int b) {
        String bewerking;
        if (b < 0) {
            bewerking = String.valueOf(a) + " + " + String.valueOf(b).substring(1) + " = ";
        }
        else {
            bewerking = String.valueOf(a) + " - " + String.valueOf(b) + " = ";
        }
        String resultaat = String.valueOf(a - b);
        return bewerking + resultaat;
    }

    public String telOp(double a, double b) {
        String bewerking;
        a = Math.round(a * 100) / (double) 100;
        b = Math.round(b * 100) / (double) 100;
        if (b < 0) {
            bewerking = String.valueOf(a) + " - " + String.valueOf(b).substring(1) + " = ";
        }
        else {
            bewerking = String.valueOf(a) + " + " + String.valueOf(b) + " = ";
        }
        double c = Math.round((a + b) * 100) / (double) 100;
        String resultaat = String.valueOf(c);
        return bewerking + resultaat;
    }
}
