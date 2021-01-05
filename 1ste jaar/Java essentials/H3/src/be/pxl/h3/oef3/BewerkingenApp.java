package be.pxl.h3.oef3;


public class BewerkingenApp {
    public static void main(String[] args) {
        Bewerkingen bew = new Bewerkingen();
        System.out.println(bew.trekAf(21.4532, -0.0332));
        System.out.println(bew.trekAf(6, -5));
        System.out.println(bew.telOp(2.23, -1.70));
    }
}
