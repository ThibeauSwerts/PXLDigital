package be.pxl.h2.opdracht10;

public class Klas {

    private String naam;
    private int aantal;
    public static final int maxaantal = 40;
    private static int tel=0;
    private static int totaalaantal=0;


    public Klas() {
        this("1TINx",0);
    }

    public Klas(String naam, int aantal) {

        this.naam = naam;
        setAantal(aantal);

        tel++;

    }

    public String getNaam() {
        return naam;
    }

    public int getAantal() {
        return aantal;
    }

    public void setAantal(int aantal) {
        totaalaantal -= this.aantal;
        if(aantal>maxaantal){
            aantal = maxaantal;
        }
        this.aantal = aantal;

        totaalaantal += this.aantal;

    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public static int getTel() {
        return tel;
    }

    public static int getTotaalaantal()
    {
        return totaalaantal;
    }

    public static double gemiddelde(){
        double gemiddelde;
        gemiddelde = (double) getTotaalaantal() / getTel();
        return gemiddelde;
    }
}