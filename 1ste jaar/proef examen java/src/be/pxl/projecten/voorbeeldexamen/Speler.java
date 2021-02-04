package be.pxl.projecten.voorbeeldexamen;

public final class Speler extends Persoon {
    private Sport sport;


    public Speler(String id) {
        this(id, "", null);
    }

    public Speler(String id, String naam, Sport sport) {
        super(id, naam);
        this.sport = sport;
    }


    public Sport getSport() {
        return sport;
    }


    @Override
    public String toString() {
        return super.toString() + " (" + sport.toString() + ")";
    }
}
