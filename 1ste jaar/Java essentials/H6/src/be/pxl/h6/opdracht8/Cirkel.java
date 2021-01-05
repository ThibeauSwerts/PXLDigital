package be.pxl.h6.opdracht8;

import java.util.Objects;

public class Cirkel extends GrafischElement {
    private int straal;

    public Cirkel (int straal) {
        this(0, 0, straal);
    }

    public Cirkel(int x, int y, int straal) {
        super(x, y);
        setStraal(straal);
    }


    public void setStraal(int straal) {
        this.straal = straal;
    }


    public int getStraal() {
        return straal;
    }


    @Override
    public double getOppervlakte() {
        return Math.pow(straal, 2) * Math.PI;
    }

    @Override
    public double getOmtrek() {
        return 2 * straal * Math.PI;
    }



    @Override
    public String toString() {
        return String.format("cirkel op positie (%d,%d) met straal %d", getX(),getY(), getStraal());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cirkel cirkel = (Cirkel) o;
        return straal == cirkel.straal;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), straal);
    }
}
