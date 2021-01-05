package be.pxl.h5.oef1;

public class Datum {
    private int dag;
    private int maand;
    private int jaar;
    private static final String[] maandNamen = {"januari", "februari", "maart", "april", "mei", "juni", "juli", "augustus", "september", "oktober", "november", "december"};


    public Datum() {
        this(1, 1, 2020);
    }

    public Datum(int dag, int maand, int jaar) {
        this.dag = dag;
        setMaand(maand);
        this.jaar = jaar;
    }

    public Datum(Datum kopie) {
        this(kopie.dag, kopie.maand, kopie.jaar);
    }




    public void setDag(int dag) {
        this.dag = dag;
    }

    public void setMaand(int maand) {
        if (maand < 1) {
            maand = 1;
        }
        else if (maand > 12) {
            maand = 12;
        }
        this.maand = maand;
    }

    public void setJaar(int jaar) {
        this.jaar = jaar;
    }


    public int getDag() {
        return dag;
    }

    public int getMaand() {
        return maand;
    }

    public int getJaar() {
        return jaar;
    }

    public String getMaandNaam() {
        int index = getMaand() - 1;
        return  maandNamen[index];
    }


    public String datumToString() {
        return String.valueOf(getDag()) + " "  + getMaandNaam() + " " + String.valueOf(getJaar());
    }
}
