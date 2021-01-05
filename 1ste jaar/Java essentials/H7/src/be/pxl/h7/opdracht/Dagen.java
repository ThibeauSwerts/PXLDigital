package be.pxl.h7.opdracht;

public enum Dagen {
    MAANDAG, DINSDAG, WOENSDAG, DONDERDAG, VRIJDAG, ZATERDAG(false), ZONDAG(false);

    private boolean weekdag;

    private Dagen() {
        this(true);
    }

    private Dagen(boolean weekdag) {
        this.weekdag = weekdag;
    }

    public boolean isWeekdag() {
        return weekdag;
    }

    public String getSoortDag() {
        if (isWeekdag()) {
            return "weekdag";
        }
        else {
            return "weekenddag";
        }
    }
}
