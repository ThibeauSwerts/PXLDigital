package be.pxl.h2.voorbeeld;

public class Rechthoek {
    // EIGENSCHAPPEN
    private int x;
    private int y;
    private int hoogte;
    private int breedte;
    public static final int HOEKEN = 4;
    private static int tel = 0;

    // CONSTRUCTORS
    public Rechthoek() {
        // of
        this(0, 0);
    }

    public Rechthoek(int breedte, int hoogte) {
        /*this.breedte = breedte;
        this.hoogte = hoogte;*/
        // of
         this(0, 0, breedte, hoogte);
    }

    public Rechthoek(int x, int y, int breedte, int hoogte) {
        setX(x);
        setY(y);
        setBreedte(breedte);
        setHoogte(hoogte);
        tel++;
    }

    public Rechthoek(Rechthoek kopie) {
        // copy constructor
        /*this.breedte = kopie.getBreedte();
        this.hoogte = kopie.getHoogte();
        this.x = kopie.getX();
        this.y = kopie.getY();*/
        // kan ook zonder get() en gewoon kopie.y bv
        // of
        this(kopie.x, kopie.y, kopie.breedte, kopie.hoogte);
    }

    // METHODEN
    // SETTERS
    public void setPositie(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setHoogte(int hoogte) {
        if (hoogte < 0) {
            this.hoogte = -1 * hoogte;
        }
        else {
            this.hoogte = hoogte;
        }
    }

    public void setBreedte(int breedte) {
        if (breedte < 0) {
            this.breedte = -1 * breedte;
        }
        else {
            this.breedte = breedte;
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

    public void groei(int delta) {
        groei(delta, delta);
    }


    // GETTERS
    public int getOppervlakte() {
        return breedte * hoogte;
    }

    public int getOmtrek() {
        return 2 * (breedte + hoogte);
    }

    public int getBreedte() {
        return breedte;
    }

    public int getHoogte() {
        return hoogte;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static int getTel() {
        return tel;
    }

    // MISC
    public void print() {
        System.out.printf("%d %d %d %d%n", x, y, hoogte, breedte);
    }
}
