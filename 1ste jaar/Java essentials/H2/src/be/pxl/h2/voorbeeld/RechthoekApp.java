package be.pxl.h2.voorbeeld;

public class RechthoekApp {
    public static void main(String[] args) {
        System.out.println("dit programma maakt een rechthoek");

        Rechthoek rechthoek = new Rechthoek();
        rechthoek.print();
        rechthoek.setX(3);
        rechthoek.setY(4);
        rechthoek.setBreedte(5);
        rechthoek.setHoogte(7);;
        rechthoek.print();

        int omtrek = rechthoek.getOmtrek();
        System.out.println("omtrek: " + omtrek);
        System.out.println("oppervlakte: " + rechthoek.getOppervlakte());

        Rechthoek rechthoek2 = new Rechthoek();
        rechthoek2.setX(10);
        rechthoek2.setY(11);
        rechthoek2.setBreedte(15);
        rechthoek2.setHoogte(12);
        rechthoek2.print();

        Rechthoek rechthoek3 = new Rechthoek();
        rechthoek3.setHoogte(-5);
        rechthoek3.setBreedte(-8);
        rechthoek3.setX(-2);
        rechthoek3.setY(-6);
        rechthoek3.print();

        Rechthoek rechthoek4 = new Rechthoek(5, 6);
        System.out.println(rechthoek4.getHoogte());
        System.out.println(rechthoek4.getBreedte());

        Rechthoek rechthoek5 = new Rechthoek(5, 6, 1, 2);
        System.out.println(rechthoek5.getHoogte());
        System.out.println(rechthoek5.getBreedte());
        System.out.println(rechthoek5.getX());
        System.out.println(rechthoek5.getY());

        Rechthoek rechthoek6 = new Rechthoek(rechthoek5);

        System.out.println(Rechthoek.getTel());
    }

}
