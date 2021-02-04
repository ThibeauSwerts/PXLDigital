package be.pxl.projecten.voorbeeldexamen;

import java.time.LocalDateTime;

public class Toernooi {
    private Wedstrijd[] wedstrijden;
    private static final int MAX_AANTAL_WEDSTRIJDEN = 10;

    public Toernooi() {
        wedstrijden = new Wedstrijd[MAX_AANTAL_WEDSTRIJDEN];
    }

    public void voegWedstrijdToe(Wedstrijd wedstrijd) {
        boolean legePlek = false;
        for (int i = 0; i < wedstrijden.length; i++) {
            if (wedstrijden[i] == null) {
                wedstrijden[i] = wedstrijd;
                legePlek = true;
                break;
            }
        }
        if (!legePlek) {
            System.out.println("geen ruimte meer voor wedstrijden");
        }
    }

    public LocalDateTime zoekDatumVolgendeWedstrijdVan(String spelerId) {
        for (Wedstrijd wedstrijd : wedstrijden) {
            if (wedstrijd.spelerIdKomtVoor(spelerId) && wedstrijd.berekenAantalMinutenNa(LocalDateTime.now()) > 0) {
                return wedstrijd.getWedstrijdDatum();
            }
        }
        return null;
    }
}
