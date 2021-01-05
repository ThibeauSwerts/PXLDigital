package be.pxl.h1.opdracht7;

import java.util.Scanner;

public class celcius_to_fahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("geef celcius");
        int celcius = scanner.nextInt();

        double fahrenheit = (9.0 / 5) * celcius + 32;
        fahrenheit = Math.round(fahrenheit * 10) / 10.0;
        System.out.println(celcius + " in fahrenheit is " + fahrenheit);

        scanner.close();

    }

}
