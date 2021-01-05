package be.pxl.h6.oef2;

public class VliegtuigReis extends Reis {
    private String vluchtnummer;
    private static final int MINIMUM_PRIJS = 25;


    public VliegtuigReis (String bestemming) {
        this(bestemming, MINIMUM_PRIJS, bestemming.charAt(0) + "999");
    }

    public VliegtuigReis (String bestemming, double prijs, String vluchtnummer) {
        super(bestemming, prijs);
        setVluchtnummer(vluchtnummer);
    }


    public void setVluchtnummer(String vluchtnummer) {
        if (vluchtnummer.charAt(0) != getBestemming().charAt(0)) {
            vluchtnummer = getBestemming().charAt(0) + vluchtnummer;
        }
        this.vluchtnummer = vluchtnummer;
    }


    public String getVluchtnummer() {
        return vluchtnummer;
    }

    public static int getMinimumPrijs() {
        return MINIMUM_PRIJS;
    }


    @Override
    public String toString() {
        return super.toString() + "Vliegtuigreis (vluchtnr " + getVluchtnummer() + ")";
    }
}
