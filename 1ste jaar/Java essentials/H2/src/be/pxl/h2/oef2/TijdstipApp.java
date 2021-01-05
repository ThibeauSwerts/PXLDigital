package be.pxl.h2.oef2;

public class TijdstipApp {
    public static void main(String[] args) {
        Tijdstip t1 = new Tijdstip(4926);
        System.out.println(t1.bepaalUren());
        System.out.println(t1.bepaalMinuten());
        System.out.println(t1.bepaalSeconden());


    }
}
