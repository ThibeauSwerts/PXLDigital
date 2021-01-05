package be.pxl.h6.oef3;

import java.util.Locale;

public class Voetballer extends Sporter {
    private String club;
    private String opstelling;
    private static final String[] opstellingen = {"middenvelder", "aanvaller","verdediger", "onbepaald"};

    public Voetballer(String naam, String voornaam) {
        this(naam, voornaam, "onbepaald", "onbepaald");
    }

    public Voetballer(String naam, String voornaam, String club, String opstelling) {
        super(naam, voornaam, "voetbal");
        this.club = club;
        setOpstelling(opstelling);
    }


    public void setOpstelling(String opstelling) {
        opstelling = opstelling.toLowerCase();
        boolean gevonden = false;
        for (String geldigeOpstelling : opstellingen) {
            if (opstelling.equals(geldigeOpstelling)) {
                gevonden = true;
            }
        }
        if (!gevonden) {
            opstelling = "onbepaald";
        }
        this.opstelling = opstelling;
    }

    public void setClub(String club) {
        this.club = club;
    }


    public String getClub() {
        return club;
    }

    public String getOpstelling() {
        return opstelling;
    }

    public static String[] getOpstellingen() {
        return opstellingen;
    }


    @Override
    public void print() {
        super.print();
        System.out.println("club: " + club + " opstelling: " + opstelling);
    }
}
