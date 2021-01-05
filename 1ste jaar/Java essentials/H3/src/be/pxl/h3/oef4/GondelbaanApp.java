package be.pxl.h3.oef4;

public class GondelbaanApp {
    public static void main(String[] args) {
        Gondelbaan g1 = new Gondelbaan("AiGUille dU MIDi", "Zwitserland", 14, 200);
        System.out.println(g1.getNaam());
        System.out.println(g1.getDuur());
    }
}
