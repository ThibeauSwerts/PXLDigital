package be.pxl.h6.voorbeeldPersoon;

public class Lector extends Persoon {
    private int personeelsNummer;
    private int aanstellingsPercentage;
    private int salaris;
    private static int aantal;


    public Lector() {
        this("onbekend", "onbekend", 20009999, 100, 2000);
    }

    public Lector(String naam, String voornaam, int aanstellingsPercentage, int salaris) {
        this(naam, voornaam, 20009999, aanstellingsPercentage, salaris);
    }

    public Lector(String naam, String voornaam, int personeelsNummer, int aanstellingsPercentage, int salaris) {
        super(naam, voornaam);
        setPersoneelsNummer(personeelsNummer);
        setAanstellingsPercentage(aanstellingsPercentage);
        setSalaris(salaris);
        aantal++;
    }



    public void setPersoneelsNummer(int personeelsNummer) {
        this.personeelsNummer = personeelsNummer;
    }

    public void setAanstellingsPercentage(int aanstellingsPercentage) {
        if (aanstellingsPercentage > 100) {
            aanstellingsPercentage = 100;
        }
        else if (aanstellingsPercentage < 0 ) {
            aanstellingsPercentage = 0;
        }
        // update salaris
        if (this.aanstellingsPercentage > 0 && this.salaris > 0) {
            double tussenResultaat = this.salaris / (double) this.aanstellingsPercentage;
            this.salaris = (int) Math.round(tussenResultaat * aanstellingsPercentage);
        }
        this.aanstellingsPercentage = aanstellingsPercentage;

    }

    public void setSalaris(int salaris) {
        this.salaris = salaris;
    }



    public int getPersoneelsNummer() {
        return personeelsNummer;
    }

    public int getAanstellingsPercentage() {
        return aanstellingsPercentage;
    }

    public int getSalaris() {
        return salaris;
    }

    public static int getAantal() {
        return aantal;
    }


    public void print() {
        super.print();
        System.out.println("personeelsnummer: " + personeelsNummer);
        System.out.println("aanstellingspercentage: " + aanstellingsPercentage);
        System.out.println("salaris: " + salaris);
    }
}
