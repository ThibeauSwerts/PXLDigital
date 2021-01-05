package be.pxl.h6.oef1;

public class WerknemerApp {
    public static void main(String[] args) {
        Werknemer w1 = new Werknemer("barilla", "sandro");
        Werknemer w2 = new Werknemer("roch", "arthur", "kechie", 50);
        Manager m1 = new Manager("bonneux", "stijn", "opperkech", 3800, 150);
        Manager m2 = new Manager("tarantsov", "ivan", "B I G BOSS", 5500, 250);

        System.out.println(m1.getSalaris());
        w2.print();
        m1.print();
        w1.print();
        m2.print();
        System.out.println(Manager.getProcAandeelManagers() + "%");
    }
}
