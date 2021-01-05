package be.pxl.h2.oef4;

public class AutoApp {
    public static void main(String[] args) {
        Auto vw = new Auto();
        Auto audi = new Auto("Audi", "RS6", 2019, "Rood", 220.5);
        Auto ford = new Auto("Ford", "Mustang Mach-E", 2021, "Blauw", 250);
        Auto audi2 = new Auto(audi);

        audi2.setKleur("geel");

        System.out.println("er zijn " + Auto.getTel() + " auto's aangemaakt");

        Auto[] autos = {vw, audi, ford, audi2};

        double traag = 0;
        for(Auto auto : autos) {
            auto.print();
            System.out.println("************************************");
            if (auto.getMaximumSnelheid() < Auto.getMAXIMUM()) {
                traag++;
            }
        }
        double percentage = traag / Auto.getTel() * 100;
        System.out.printf("%3.1f%% van de autos gaat niet sneller dan de maximumsnemheid%n", percentage);

    }
}
