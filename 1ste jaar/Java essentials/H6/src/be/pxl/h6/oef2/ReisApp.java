package be.pxl.h6.oef2;

public class ReisApp {
    public static void main(String[] args) {
        TreinReis t1 = new TreinReis("hasselt", 7.8, true, "PO");
        VliegtuigReis v1 = new VliegtuigReis("cairo", 124.7, "t105");
        GeboekteReis g1 = new GeboekteReis("sandro barilla", 2);
        g1.voegReisToe(t1);
        g1.voegReisToe(v1);
        g1.voegReisToe(t1);
        g1.print();
    }
}
