package be.pxl.h5.oefC;

public class RGBPixel {
    private int rood;
    private int groen;
    private int blauw;

    public RGBPixel(int rood, int groen, int blauw) {
        this.rood = rood;
        this.groen = groen;
        this.blauw = blauw;
    }


    public int getRood() {
        return rood;
    }

    public int getGroen() {
        return groen;
    }

    public int getBlauw() {
        return blauw;
    }



    public String toString() {
        return "(" + rood + ", " + groen + ", " + blauw + ")";
    }

    public void naarGrijswaarde() {
        int gemiddelde = (rood + groen + blauw) / 3;
        rood = gemiddelde;
        groen = gemiddelde;
        blauw = gemiddelde;
    }

    public void naarInverse() {
        rood = 255 - rood;
        blauw = 255 - blauw;
        groen = 255 - groen;
    }
}
