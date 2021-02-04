package be.pxl.projecten.voorbeeldexamen;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Wedstrijd implements DatumVergelijkbaar {
    private static final DateTimeFormatter FORMAT = null; //TODO wat moet hier?
    private LocalDateTime wedstrijdDatum;
    private Team team1;
    private Team team2;
    private Scheidsrechter scheidsrechter;
    private int scoreTeam1;
    private int scoreTeam2;



    public Wedstrijd(Team team1, Team team2, Scheidsrechter scheidsrechter, int dag, int maand, int jaar, int uur, int minuut) {
        this.team1 = team1;
        this.team2 = team2;
        this.scheidsrechter = scheidsrechter;
        this.wedstrijdDatum = LocalDateTime.of(LocalDate.of(jaar, maand, dag), LocalTime.of(uur, minuut));
    }

    public boolean spelerIdKomtVoor(String id) {
        return team1.spelerIdKomtVoor(id) || team2.spelerIdKomtVoor(id);
    }

    public long berekenAantalMinutenNa(LocalDateTime datum) {
        return ChronoUnit.MINUTES.between(wedstrijdDatum, datum);
    }

    public LocalDateTime getWedstrijdDatum() {
        return wedstrijdDatum;
    }

    public void setScore(int scoreTeam1, int scoreTeam2) {
        this.scoreTeam1 = scoreTeam1;
        this.scoreTeam2 = scoreTeam2;
    }

    @Override
    public String toString() {
        if (wedstrijdDatum.isAfter(LocalDateTime.now())) {
            return "wedstrijd is nog niet begonnen";
        }
        else {
            StringBuilder printer = new StringBuilder();
            printer.append("TEAM1\n");
            printer.append(team1.toString());
            printer.append("TEAM2\n");
            printer.append(team2.toString());
            printer.append(wedstrijdDatum + "\n");
            printer.append("SCHEIDSRECHTER" + scheidsrechter.toString() + "\n");
            printer.append("SCORE " + scoreTeam1 + " " + scoreTeam2 + "\n");
            return printer.toString();
        }
    }
}
