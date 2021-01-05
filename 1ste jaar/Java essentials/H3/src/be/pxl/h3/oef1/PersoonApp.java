package be.pxl.h3.oef1;

import java.util.Random;

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
        System.out.println(p4.geefNaamAfgekort());

        Persoon p5 = new Persoon("victor", "Bollen");
        Random rand = new Random();
        double gewicht = rand.nextInt(61) + 40;
        p5.setGewicht(gewicht);
        double lengte = rand.nextInt(54) / (double) 100 + 1.54;
        p5.setLengte(lengte);
        System.out.println(p5.infoToString());
        System.out.println(p5.geefInitiaal());
        System.out.println(p5.berekenBmi());
    }
}
