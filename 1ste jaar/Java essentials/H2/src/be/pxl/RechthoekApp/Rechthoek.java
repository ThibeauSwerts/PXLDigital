package be.pxl.RechthoekApp;

public class Rechthoek
{
    public int x;
    public int y;
    public int hoogte;
    public int breedte;

    public void setPositie(int x, int y)
    {
        setX(x);
        setY(y);

    }
    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public void groei(int dw, int dh)
    {
        breedte += dw;
        hoogte += dh;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public int getHoogte()
    {
        return hoogte;
    }

    public int getBreedte()
    {
        return breedte;
    }

    public int getOmtrek()
    {
        return (breedte + hoogte) * 2;
    }

    public  int getOppervlakte()
    {
        return breedte * hoogte;
    }
}
