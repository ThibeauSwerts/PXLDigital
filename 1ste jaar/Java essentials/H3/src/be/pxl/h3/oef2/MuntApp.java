package be.pxl.h3.oef2;

public class MuntApp {
    public static void main(String[] args) {
        Munt m1 = new Munt("Briste pond", 1);
        Munt m2 = new Munt("Amerikaanse dollar", 1.28469);
        Munt m3 = new Munt("euro", 1.14223);
        Munt m4 = new Munt("russische roebel", 86.95023);

        Munt munten[] = {m1, m2, m3, m4};
        System.out.println("overzicht koersen tov " + munten[0].getNaam() + ": 1 " + munten[0].getNaam() + " =");
        for (Munt munt : munten) {
            System.out.printf("%10.3f %s%n", munt.getKoers(), munt.getNaam());
        }
    }
}
