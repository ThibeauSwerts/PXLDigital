package be.pxl.h2.oef3;

public class BankrekeningApp {
    public static void main(String[] args) {
        Bankrekening br = new Bankrekening();

        br.stort(100);

        br.setRekeningNnummer("BE1234567890");

        br.stort(100);
        br.neemOp(200);

        br.neemOp(100);

        int[] verrichtingen = {300, -50, 100, -100, 50};
        br.doeVerrichting(verrichtingen);

        br.schrijfRenteBij();

        br.print();

    }
}
