package be.pxl.h6.oef2;

public class TreinReis extends Reis {
    private boolean nationaal; // true voor binnenlandse ritten, false voor internationale ritten
    private String specificatie;
    private static final String[] specificaties = {"IC", "IR", "L", "P"};



    public TreinReis(String bestemming) {
        super(bestemming);
        setNationaal(true);
        setSpecificatie("IC");
    }


    public TreinReis(String bestemming, double prijs, boolean nationaal, String specificatie) {
        super(bestemming, prijs);
        setNationaal(nationaal);
        setSpecificatie(specificatie);
    }



    public void setNationaal(boolean nationaal) {
        this.nationaal = nationaal;
    }

    public void setSpecificatie(String specificatie) {
        if (isNationaal()) {
            boolean gevonden = false;
            for (String spec : specificaties) {
                if (specificatie.equals(spec)) {
                    gevonden = true;
                }
            }
            if (!gevonden) {
                specificatie = "IC";
            }
        }
        this.specificatie = specificatie;
    }



    public boolean isNationaal() {
        return nationaal;
    }

    public String getSpecificatie() {
        return specificatie;
    }


    @Override
    public String toString() {
        String terug = super.toString();
        if (isNationaal()) {
            terug += "Nationale ";
        }
        else {
            terug +=  "Internationale ";
        }
        terug += "treinreis (" + getSpecificatie() + ")";
        return terug;
    }
}
