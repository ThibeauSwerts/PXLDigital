package be.pxl.h3.oef4;

public class Gondelbaan {
    private String naam;
    private String land;
    private int hoogteDalstation;
    private int hoogteBergstation;
    private double lengte;
    private int snelheid;
    private int passagiersPerGondel;
    private int aantalGondels;
    public static final String[] GELDIGE_LANDEN = {"Frankrijk", "Oostenrijk", "Zwitserland", "Italië"};


    public Gondelbaan(String naam, String land, double lengte, int snelheid) {
        setNaam(naam);
        setLand(land);
        this.lengte = lengte;
        setSnelheid(snelheid);
    }

    public Gondelbaan(String naam, String land) {
        this(naam, land, 2, 6);
    }



    public void setNaam(String naam) {
        String[] tussenstap = naam.split(" ");
        StringBuilder naamBuilder = new StringBuilder();
        for (String deelnaam : tussenstap) {
            naamBuilder.append(deelnaam.substring(0, 1).toUpperCase()).append(deelnaam.substring(1).toLowerCase()).append(" ");
        }
        naam = naamBuilder.toString();
        this.naam = naam;
    }

    public void setLand(String land) {
        for (String geldigLand : GELDIGE_LANDEN) {
            if (land.equals(geldigLand)) {
                this.land = land;
                return;
            }
        }
        this.land = "onbekend";
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public void setSnelheid(int snelheid) {
        if (snelheid < 3) {
            snelheid = 3;
        }
        else if (snelheid > 8) {
            snelheid = 8;
        }
        this.snelheid = snelheid;
    }

    public void setPassagiersPerGondel(int passagiersPerGondel) {
        this.passagiersPerGondel = passagiersPerGondel;
    }

    public void setAantalGondels(int aantalGondels) {
        this.aantalGondels = aantalGondels;
    }

    public void setHoogte(int a, int b) {
        hoogteBergstation = Math.max(a, b);
        hoogteDalstation = Math.min(a, b);
    }



    public String getNaam() {
        return naam;
    }

    public String getLand() {
        return land;
    }

    public int getHoogteDalstation() {
        return hoogteDalstation;
    }

    public int getHoogteBergstation() {
        return hoogteBergstation;
    }

    public double getLengte() {
        return lengte;
    }

    public int getSnelheid() {
        return snelheid;
    }

    public int getPassagiersPerGondel() {
        return passagiersPerGondel;
    }

    public int getAantalGondels() {
        return aantalGondels;
    }

    public int getHoogteVerschil() {
        return hoogteBergstation - hoogteDalstation;
    }

    public int getDuur() {
        return (int) (lengte * 1000 / snelheid) / 60;
        // foute uitkomst
    }
}
