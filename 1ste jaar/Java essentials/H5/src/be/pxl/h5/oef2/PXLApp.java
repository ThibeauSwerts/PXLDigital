package be.pxl.h5.oef2;

public class PXLApp {
    public static void print(Leraar leraar) {
        System.out.println("Leraar " + leraar.getNaam() + " is aangesteld voor " +
                leraar.getAantstellingsPercentage() + "%");
        System.out.println("Volgende vakken behoren tot het takenpakket:");
        for (int jaar = 1; jaar <= 3; jaar++) {
            System.out.println("Vakken van jaar " + jaar + ":");
            for (int i = 0; i < leraar.getAantalVakken(); i++) {
                Vak v = leraar.getVak(i);
                if (v.getJaar().equals(jaar + "")) {
                    System.out.printf("%5s%-13s%-25s%d%n", " ", v.getCode(),
                            v.getNaam(), v.getAantalStudiepunten());
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] codeArray = {"41TIN1100", "41TIN1130", "41TIN1140",
                "41TIN1180", "41TIN1230", "41TIN1240", "41TIN1280",
                "41TIN1300","42TIN1220", "42TIN1230", "43AON3120", "43AON3130"};

        String[] naamArray = {"Web Essentials", "Java Essentials", ".Net Essentials",
                "Business flow Essentials", "Cisco Academy: CCNA", "Os Essentials",
                "Communication skills 1","It Essentials", ".Net Advanced", "Java Advanced",
                "Programming Expert", "Mobile development"};

        int[] studiepuntenArray = {3, 6, 6, 3, 3, 6, 6, 6, 3, 3, 3, 3};

        Vak[] vakken = new Vak[codeArray.length];

        for (int i = 0; i < vakken.length; i++) {
            vakken[i] = new Vak(codeArray[i], naamArray[i], studiepuntenArray[i]);
        }

        Leraar onsRita = new Leraar("Onze", "Rita", 87);

        System.out.println(onsRita.getAantstellingsPercentage());

        onsRita.voegVakToe(vakken[1]);
        onsRita.voegVakToe(vakken[7]);
        onsRita.voegVakToe(vakken[9]);
        onsRita.voegVakToe(vakken[10]);
        onsRita.voegVakToe(vakken[8]);
        print(onsRita);
    }
}
