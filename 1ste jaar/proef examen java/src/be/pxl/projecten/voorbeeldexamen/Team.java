package be.pxl.projecten.voorbeeldexamen;

public class Team {
    private Sport sport;
    private Speler[] spelers;


    public Team(Sport sport) {
        this.spelers = new Speler[sport.getAantalspelers()];
        this.sport = sport;
    }


    public void voegSpelerToe(Speler speler) {
        int vrijePositie = vindVrijePositie();
        if (speler.getSport() == sport && !spelerKomtVoor(speler) && vrijePositie != -1) {
            spelers[vrijePositie] = speler;
        }
        else {
            System.out.println("Foutieve ingave");
        }
    }

    private boolean spelerKomtVoor(Speler speler) {
        for (Speler teamSpeler : spelers) {
            if (teamSpeler != null && teamSpeler.equals(speler)) {
                // null checken want anders nullpointer-exception bij equals() als er een null-waarde in team zit
                return true;
            }
        }
        return false;
    }

    private int vindVrijePositie() {
        for (int i = 0; i < spelers.length; i++) {
            if (spelers[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public boolean spelerIdKomtVoor(String id) {
        Speler nieuweSpeler = new Speler(id);
        return spelerKomtVoor(nieuweSpeler);
    }

    @Override
    public String toString() {
        if (vindVrijePositie() != -1) {
            return "Onvolledig team";
        }
        StringBuilder printer = new StringBuilder();
        for (Speler teamSpeler : spelers) {
            printer.append(teamSpeler.toString());
            printer.append("\n");
        }
        return printer.toString();
    }
}
