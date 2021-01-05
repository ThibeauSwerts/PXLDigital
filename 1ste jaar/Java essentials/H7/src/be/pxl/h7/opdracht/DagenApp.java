package be.pxl.h7.opdracht;

import java.util.Random;

public class DagenApp {
    public static void main(String[] args) {
        for (Dagen dag : Dagen.values()) {
            System.out.printf("%-10s [%d] - %5s%n", dag.name(), dag.ordinal(), dag.getSoortDag());
        }
        System.out.println();

        Random rand = new Random();
        int randomIndex = rand.nextInt(Dagen.values().length);
        Dagen d1 = Dagen.values()[randomIndex];
        int randomIndex2 = rand.nextInt(Dagen.values().length);
        Dagen d2 = Dagen.values()[randomIndex2];
        System.out.println(d1 + " & " + d2 + ":");
        if (d1 == d2) {
            System.out.println("dagen zijn gelijk");
        }
        else {
            System.out.println("dagen zijn niet gelijk");
            if (d1.ordinal() < d2.ordinal()) {
                System.out.println(d1 + " komt eerst");
            }
            else {
                System.out.println(d2 + " komt eerst");
            }
            System.out.println("er liggen " +
                    String.valueOf(Math.max(d1.ordinal(), d2.ordinal()) - Math.min(d1.ordinal(), d2.ordinal()) - 1) +
                    " dag(en) tussen"); // of met Math.abs() werken
        }

    }
}
