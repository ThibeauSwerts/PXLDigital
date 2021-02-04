package be.pxl.projecten.voorbeeldexamen;

public enum Sport {
    VOETBAL(11), VOLLEYBAL(8), TENNIS(2);

    private int aantalspelers;

    private Sport(int aantalspelers) {
        this.aantalspelers = aantalspelers;
    }

    public int getAantalspelers() {
        return aantalspelers;
    }
    @Override
    public String toString() {
        return name().substring(0, 3).toLowerCase();
    }
}
