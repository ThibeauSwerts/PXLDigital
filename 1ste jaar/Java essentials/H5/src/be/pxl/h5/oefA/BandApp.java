package be.pxl.h5.oefA;

public class BandApp {
    public static void main(String[] args) {
        Instrument gitaar = new Instrument("gitaar", "beeeewwww");
        Instrument bas = new Instrument("bas", "buuuuwwwww");
        Instrument drum = new Instrument("drum", "Boenk baf boenk baf");

        Muzikant m1 = new Muzikant("monke", gitaar);
        Muzikant m2 = new Muzikant("ele", bas);
        Muzikant m3 = new Muzikant("tiger", drum);

        Muzikant[] leden = {m1, m2, m3};

        Band arctic = new Band("arctic", leden);

        arctic.speel(9);
        System.out.println();
        System.out.println(arctic.toString());
    }
}
