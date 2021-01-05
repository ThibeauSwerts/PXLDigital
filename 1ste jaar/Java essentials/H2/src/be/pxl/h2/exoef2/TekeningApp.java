package be.pxl.h2.exoef2;

public class TekeningApp {
    public static void main(String[] args) {
        Tekening t1 = new Tekening();

        t1.tekenDriehoek(9, '$');
        System.out.println();
        t1.tekenRechthoekLeeg(6, 4);
        System.out.println();
        t1.tekenRechthoekVol(6, 4);}

}

