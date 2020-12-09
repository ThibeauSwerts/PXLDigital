package be.pxl.h2.opdracht10;

public class KlasApp
{
    public static void main(String[] args) {
        Klas test = new Klas("1TING",20);
        Klas test2 = new Klas("1TINB",80);
        Klas test3 = new Klas("1TINF",12);

        Klas test4 = new Klas("1TINQ",33);

        Klas[] klaslijst = {test,test2,test3,test4};

        System.out.println(Klas.maxaantal);

        for (Klas klas : klaslijst){
            System.out.printf("%s: %d studenten%n", klas.getNaam(), klas.getAantal());
        }

        System.out.println("totaal studente: "+Klas.getTotaalaantal());
        System.out.println("Totaal klassen: "+Klas.getTel());

        System.out.printf("Het gemiddelde is %.1f",Klas.gemiddelde());
    }

}
