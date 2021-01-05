package be.pxl.h5.opdracht;

public class BoekApp {
    public static void main(String[] args) {
        Boek b1 = new Boek();
        b1.toonBoekGegevens();

        Auteur auteur = new Auteur("Barilla", "Sandro");
        Boek b2 = new Boek("golden age", "1819250119", 125, auteur);

        System.out.println(b2.getAuteur().getNaam());
        b2.toonBoekGegevens();


    }
}
