package be.pxl.h5.oef1;

public class HuwelijkApp {
    public static void main(String[] args) {
        Adres a1 = new Adres("Schotelstraat", "75", 3511, "Stokrooie");
        Datum d1 = new Datum(15, 5, 2001);
        Persoon p1 = new Persoon("Barilla", "Sandro", a1, d1);

        Persoon p2 = new Persoon("Bollen", "Victor", "Kroonwinningstraat", "17", 3500, "Rapertingen", 12, 7, 2001);


        Huwelijk h1 = new Huwelijk(p1, p2, 15, 3, 2019);
        System.out.println(p2.getAdres().toString());
        h1.adresWijziging("lentestraat", "48", 3600, "Genk");
        System.out.println(p1.getAdres().toString());
        System.out.println(p2.getAdres().toString());
        System.out.println();
        h1.print();
        System.out.println(h1.huwelijksdatum.getJaar());




    }
}
