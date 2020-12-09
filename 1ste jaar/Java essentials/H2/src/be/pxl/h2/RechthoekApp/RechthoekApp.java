package be.pxl.h2.RechthoekApp;

public class RechthoekApp
{
    public static void main(String[] args) {
        System.out.println("Dit programma maakt een rechthoek.");
        Rechthoek rechthoek = new Rechthoek();
        Rechthoek rechthoek2 = new Rechthoek(1, 2);
        Rechthoek rechthoek3 = new Rechthoek(1, 2, 3, 5);
        Rechthoek rechthoek4 = new Rechthoek(rechthoek3);

        rechthoek3.setX(100);

        System.out.println(be.pxl.h2.RechthoekApp.Rechthoek.HOEKEN);
        System.out.println(be.pxl.h2.RechthoekApp.Rechthoek.tel);
        rechthoek.setX(3);
        rechthoek.setY(4);
        rechthoek.setHoogte(-5);
        rechthoek.setBreedte(-6);

        rechthoek2.setX(5);
        rechthoek2.setY(6);
        rechthoek2.setHoogte(12);
        rechthoek2.setBreedte(14);

        int omtrek = rechthoek.getOmtrek();// methode 1

        System.out.println("Omtrek: " + omtrek);

        System.out.println("Oppervlakte: " + rechthoek.getOppervlakte()); // methode 2
    }
}