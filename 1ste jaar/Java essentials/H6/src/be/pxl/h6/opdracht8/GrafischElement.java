package be.pxl.h6.opdracht8;

import java.util.Objects;

public abstract class GrafischElement {
    private int x;
    private int y;
    private static int aantal;


    public GrafischElement (int x, int y) {
        this.x = x;
        this.y = y;
        aantal++;
    }


    public void setPositie (int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static int getAantal() {
        return aantal;
    }

    public abstract double getOppervlakte();
    public abstract double getOmtrek();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GrafischElement that = (GrafischElement) o;
        return x == that.x && y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
