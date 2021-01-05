package be.pxl.h2.oef1;

public class PersoonApp {
    public static void main(String[] args) {
        Persoon persoon = new Persoon();
        persoon.setVoornaam("sandro");
        persoon.setNaam("barilla");
        persoon.setLengte(1.69);
        persoon.setGewicht(63.9);
        persoon.setGeboortejaar(2001);

        System.out.println(persoon.infoToString());

        double bmi = persoon.berekenBmi();
        System.out.println("BMI: " + bmi);
        System.out.println(persoon.geefOmschriving(bmi));

        persoon.voegVoornamenToe("victor emilio robin xavier");
        System.out.println(persoon.getVoornaam());
        System.out.println(persoon.getLeeftijd() + "j");

        persoon.groei();
        System.out.println(persoon.getLengte());
        persoon.groei(23);
        System.out.println(persoon.getLengte());



        Persoon p2 = new Persoon("emilio", "corthaut");
        p2.infoToString();

        Persoon p3 = new Persoon(p2);
        p3.infoToString();

        Persoon p4 = new Persoon();
        p4.infoToString();
    }
}
