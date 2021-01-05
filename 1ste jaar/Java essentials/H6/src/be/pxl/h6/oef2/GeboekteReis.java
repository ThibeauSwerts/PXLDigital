package be.pxl.h6.oef2;

public class GeboekteReis {
    private String naam;
    private Reis[] reizen;
    public static int tel;

    public GeboekteReis(String naam, int aantalReizen) {
        this.naam = naam;
        reizen = new Reis[aantalReizen];
    }


    public void voegReisToe(Reis reis) {
        if (tel < reizen.length) {
            reizen[tel] = reis;
            tel++;
        }
        else {
            System.out.println("deze reis heeft al " + reizen.length + " boekingen");
        }
    }


    public void print() {
        System.out.println("Reis voor " + naam);
        for (int i = 0; i < reizen.length; i++) {
            System.out.println("==> reis " + String.valueOf(i + 1) + " " + reizen[i].toString());
        }
        System.out.println("deze passagier moet " + String.valueOf(reizen.length - 1) + " keer overstappen");
    }
}
