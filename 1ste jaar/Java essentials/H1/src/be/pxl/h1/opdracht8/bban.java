package be.pxl.h1.opdracht8;

public class bban {
    public static void main(String[] args) {
        long rekeningnummer = 539007547034L;
        rekeningnummer *= 1000000;
        rekeningnummer += 111400;
        rekeningnummer %= 97;
        int controlegetal = 98 - (int) rekeningnummer;

        System.out.println("het nummer na BE is " + controlegetal);
    }
}
