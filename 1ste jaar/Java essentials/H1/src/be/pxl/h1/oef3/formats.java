package be.pxl.h1.oef3;

public class formats {
    public static void main(String[] args) {
        System.out.printf("%20s %-20s %20s %20s %n", "1. gewoon", "2. links", "3. rechts (met null)", "4. rechts met 3 dec");

        double getal = 0;
        for (int i = 1; i <= 9; i++) {
            getal = (getal * 10) + i;
            System.out.printf("%20f %-20f %020f %20.3f %n", getal, getal, getal, getal);

        }


    }
}
