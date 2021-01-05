package be.pxl.h7.oef2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class KaartspelApp {
    public static void main(String[] args) {
        Kaart[] boek = new Kaart[52];
        int i = 0;
        for (Soort soort : Soort.values()) {
            for (Ranking waarde : Ranking.values()) {
                boek[i] = new Kaart(waarde, soort);
                i++;
            }
        }
        Collections.shuffle(Arrays.asList(boek));

        Random random = new Random();
        Kaart kaartComputer = boek[random.nextInt(52)];
        Kaart kaartSpeler = boek[random.nextInt(52)];

        if (kaartSpeler.getWaarde().ordinal() < kaartComputer.getWaarde().ordinal()) {
            System.out.println("winnaar computer " + kaartComputer.toString());
            System.out.println("verliezer speler " + kaartSpeler.toString());
        }
        else if (kaartSpeler.getWaarde().ordinal() == kaartComputer.getWaarde().ordinal()) {
            System.out.println("geen winnaar");
        }
        else {
            System.out.println("winnaar speler " + kaartSpeler.toString());
            System.out.println("verliezer computer " + kaartComputer.toString());
        }
    }
}
