package be.pxl.h2.oef4;

public class Auto {

    private String merk;
    private String model;
    private int bouwjaar;
    private String kleur;
    private double maximumSnelheid;
    private static final int MAXIMUM = 180;
    private static int tel;



    public Auto(String merk, String model, int bouwjaar, String kleur, double maximumSnelheid) {
        this.merk = merk;
        this.model = model;
        this.bouwjaar = bouwjaar;
        this.kleur = kleur;
        setMaximumSnelheid(maximumSnelheid);
        tel++;
    }

    public Auto() {
        this("VW", "Polo", 2018, "grijs", 160);
    }

    public Auto(Auto kopie) {
        this(kopie.merk, kopie.model, kopie.bouwjaar, kopie.kleur, kopie.maximumSnelheid);
    }




    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBouwjaar(int bouwjaar) {
        this.bouwjaar = bouwjaar;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }

    public void setMaximumSnelheid(double maximumSnelheid) {
        if (maximumSnelheid > MAXIMUM) {
            maximumSnelheid = MAXIMUM;
        }
        this.maximumSnelheid = maximumSnelheid;
    }





    public String getMerk() {
        return merk;
    }

    public String getModel() {
        return model;
    }

    public int getBouwjaar() {
        return bouwjaar;
    }

    public String getKleur() {
        return kleur;
    }

    public double getMaximumSnelheid() {
        return maximumSnelheid;
    }

    public static int getMAXIMUM() {
        return MAXIMUM;
    }

    public static int getTel() {
        return tel;
    }




    public void print() {
        System.out.printf("%-20s %15s %n%-20s %15s %n%-20s %15d %n%-20s %15s %n%-20s %15.1f%n",
                "* merk", merk, "* model", model, "* bouwjaar", bouwjaar, "* kleur", kleur, "* maximumsnelheid", maximumSnelheid);
    }
}
