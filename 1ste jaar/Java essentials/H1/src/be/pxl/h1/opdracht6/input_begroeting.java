package be.pxl.h1.opdracht6;

import java.util.Scanner;

public class input_begroeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("geef voornaam");
        String voornaam = input.nextLine();
        System.out.println("geef achternaam");
        String achternaam = input.nextLine();
        String fullname = voornaam + " " + achternaam;

        System.out.println("hallo " + fullname);
        input.close();
    }
}
