package be.pxl.h6.oef3;

public class SportApp {
    public static void main(String[] args) {
        Sporter[] sporters = {new Sporter("bex", "an", "zwemmen"),
                new Sporter("nillis", "els", "volleybal"),
                new Sporter("roch", "arthur", "pagga slaan"),
                new Voetballer("Janssen", "Kurt", "PSV", "verdediger"),
                new Voetballer("Janssen", "Dave", "PSV", "aanvaller"),
                new Voetballer("Janssen", "piet", "KRC", "middenvelder"),
                new Voetballer("Janssen", "Lulu", "RCA", "verdediger"),
                new Voetballer("Janssen", "lollo", "CB", "middenvelder"),
                new Voetballer("Janssen", "ward")
        };

        System.out.println("overzicht spelers (geen voetbal):");
        for (Sporter sporter : sporters) {
            if (!(sporter instanceof Voetballer)) {
                sporter.print();
                System.out.println();
            }
        }

        System.out.println("overzicht voetballers volgens opstelling:");
        for (String opstelling : Voetballer.getOpstellingen()) {
            System.out.println("*** " + opstelling + " ***");
            for (Sporter sporter : sporters) {
                if (sporter instanceof Voetballer) {
                    Voetballer voetballer = (Voetballer) sporter;
                    if (voetballer.getOpstelling().equals(opstelling)) {
                        voetballer.print();
                        System.out.println();
                    }
                }
            }
        }
    }
}
