package be.pxl.h2.RechthoekApp;

public class Rechthoek
{
    private int x;
    private int y;
    private int hoogte;
    private int breedte;
    public static final int HOEKEN = 4;
    public static int tel = 0;

    public Rechthoek() {
        this(0, 0);
    }

    public Rechthoek(int breedte, int hoogte) {
        this(0, 0, breedte, hoogte);
    }

    public Rechthoek(int x, int y, int breedte, int hoogte) {
        setX(x);
        setY(y);
        setBreedte(breedte);
        setHoogte(hoogte);

        tel++;
    }

    //copy constructor
    public Rechthoek(Rechthoek kopie)
    {
        this(kopie.x, kopie.y, kopie.breedte, kopie.hoogte);
    }

    public void setPositie(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private int getX() {
        return x;
    }

    private int getY() {
        return y;
    }

    private int getHoogte() {
        return hoogte;
    }

    private int getBreedte() {
        return breedte;
    }

    public void setBreedte(int breedte) {
        if (breedte < 0) {
            this.breedte = -breedte;
        } else {
            this.breedte = breedte;
        }
    }

    public void setHoogte(int hoogte) {
        if (hoogte < 0) {
            this.hoogte = -hoogte;
        } else {
            this.hoogte = hoogte;
        }
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void groei(int dw, int dh) {
        setBreedte(breedte + dw);
        setHoogte(hoogte + dh);
    }

    public void groei(int d) {
        groei(d, d);
    }

    public int getOmtrek() {
        return (breedte + hoogte) * 2;
    }

    public int getOppervlakte()
    {
        return (breedte * hoogte);
    }
}
