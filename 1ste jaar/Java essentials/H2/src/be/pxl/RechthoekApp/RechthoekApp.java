package be.pxl.RechthoekApp;
import java.util.Scanner;

public class RechthoekApp
{
    public static void main(String[] args) {
        System.out.println("Dit programma maakt een rechthoek");
        Rechthoek rechthoek = new Rechthoek();
        Rechthoek rechthoek2 = new Rechthoek();

        System.out.printf("%d, %d, %d, %d%n", rechthoek.getX(), rechthoek.getY(), rechthoek.getBreedte(), rechthoek.getHoogte());

        rechthoek.x = 3;
        rechthoek.y = 4;
        rechthoek.breedte = 5;
        rechthoek.hoogte = 6;

        System.out.printf("%d, %d, %d, %d%n", rechthoek.getX(), rechthoek.getY(), rechthoek.getBreedte(), rechthoek.getHoogte());
        System.out.printf("%d, %d, %d, %d%n", rechthoek2.getX(), rechthoek2.getY(), rechthoek2.getBreedte(), rechthoek2.getHoogte());

        int omtrek = rechthoek.getOmtrek();
        System.out.println("omtrek: " + omtrek);
        System.out.println("oppervlakte: ");
    }
}