package be.pxl.h5.oef2;

public class Leraar {
    private String naam;
    private String voornaam;
    private int aantstellingsPercentage;
    private Vak[] vakken = new Vak[MAXIMUMAANTAL_VAKKEN];
    private int aantalVakken;
    private static final int MAXIMUMAANTAL_VAKKEN = 5;

    public Leraar(String naam, String voornaam, int aantstellingsPercentage) {
        this.naam = naam;
        this.voornaam = voornaam;
        setAantstellingsPercentage(aantstellingsPercentage);
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public void setAantstellingsPercentage(int aantstellingsPercentage) {
        if (aantstellingsPercentage > 100) {
            System.out.println("het aanstellingspercentage kan niet meer zijn dan 100%");
            aantstellingsPercentage = 100;
        }
        else if (aantstellingsPercentage % 10 != 0) {
            aantstellingsPercentage = (int) Math.round(aantstellingsPercentage / 10.0) * 10;
        }
        this.aantstellingsPercentage = aantstellingsPercentage;
    }



    public String getNaam() {
        return naam;
    }

    public int getAantstellingsPercentage() {
        return aantstellingsPercentage;
    }

    public Vak getVak(int i) {
        if (i >= aantalVakken) {
            System.out.println("deze leraar heeft niet zoveel vakken");
            return null;
        }
        else {
            return vakken[i];
        }
    }

    public int getAantalVakken() {
        return aantalVakken;
    }

    public static int getMaximumaantalVakken() {
        return MAXIMUMAANTAL_VAKKEN;
    }


    public void voegVakToe(Vak vak) {
        if (aantalVakken < MAXIMUMAANTAL_VAKKEN) {
            vakken[aantalVakken] = vak;
            aantalVakken++;
        }
        else {
            System.out.println("Deze leraar heeft reeds " + MAXIMUMAANTAL_VAKKEN + " vakken");
        }
    }
}
