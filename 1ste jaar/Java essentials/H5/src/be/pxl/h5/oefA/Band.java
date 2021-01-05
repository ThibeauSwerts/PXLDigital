package be.pxl.h5.oefA;

import java.util.Random;

public class Band {
    private String naam;
    private Muzikant[] leden;

    public Band(String naam, Muzikant[] leden) {
        this.naam = naam;
        this.leden = leden;
    }


    public void speel(int lengte) {
        System.out.println(naam + " in concert!");
        Random rand = new Random();
        for (int i = 0; i < lengte; i++) {
            int index = rand.nextInt(leden.length);
            leden[index].speel();
        }
    }

    public String toString() {
        StringBuilder builder = new StringBuilder(naam);
        for (Muzikant lid : leden) {
            builder.append("\n").append(lid.toString());
        }
        return builder.toString();
    }
}
