package be.pxl.h6.oef2;

public abstract class Reis {
    private String bestemming;
    private double prijs;
    private static final int MINIMUM_PRIJS = 5;


    public Reis (String bestemming) {
        this(bestemming, MINIMUM_PRIJS);
    }

    public Reis(String bestemming, double prijs) {
        setBestemming(bestemming);
        setPrijs(prijs);
    }




    public void setBestemming(String bestemming) {
        char eerste = bestemming.charAt(0);
        if (Character.isDigit(eerste)) {
            bestemming = bestemming.substring(1);
        }
        this.bestemming = bestemming;
    }

    public void setPrijs(double prijs) {
        this.prijs = Math.max(prijs, MINIMUM_PRIJS);
    }




    public String getBestemming() {
        return bestemming;
    }

    public double getPrijs() {
        return prijs;
    }

    public double getPrijsAfgerond() {
        return Math.round(getPrijs() * 100.0) / 100.0;
    }

    public static int getMinimumPrijs() {
        return MINIMUM_PRIJS;
    }


    @Override
    public String toString() {
        return String.format("Reis met bestemming " + getBestemming() + " kost " + getPrijsAfgerond() + " euro%n");
    }


}
