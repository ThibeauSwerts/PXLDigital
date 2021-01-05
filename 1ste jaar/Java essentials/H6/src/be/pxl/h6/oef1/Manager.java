package be.pxl.h6.oef1;

public class Manager extends Werknemer {
    private int bonus;
    private static int tel;


    public Manager(String naam, String voornaam, String functie, int salaris) {
        this(naam, voornaam, functie, salaris, 50);
    }


    public Manager(String naam, String voornaam, String functie, int salaris, int bonus) {
        super(naam, voornaam, functie, salaris);
        setBonus(bonus);
        tel++;
    }


    public void setBonus(int bonus) {
        this.bonus = bonus;
    }


    public int getBonus() {
        return bonus;
    }

    public static int getTel() {
        return tel;
    }

    @Override
    public int getSalaris() {
        return super.getSalaris() + bonus;
    }

    public static double getProcAandeelManagers() {
        double percentage = (double) getTel() / Werknemer.getTel() * 100;
        return Math.round(percentage * 100.0) / 100.0;
    }
}
