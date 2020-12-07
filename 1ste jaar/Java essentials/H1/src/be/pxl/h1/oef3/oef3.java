package be.pxl.h1.oef3;

import java.util.Scanner;

public class oef3
{
    public static void main(String[] args) {
        System.out.printf("%16s %-20s %20s %20s %n","1. gewoon","2. links","3. rechts met nul", "4. 3 decimalen");
        //intitialise variables
        double number = 0;

        for (int i=1; i<=9; i++)
        {
            //determine number
            number = (number * 10) + i;

            //printf
            System.out.printf("%16f %-20f %020f %20.3f %n", number,number,number,number);
        }
    }
}
