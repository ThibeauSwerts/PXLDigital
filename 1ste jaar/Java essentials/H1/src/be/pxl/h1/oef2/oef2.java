package be.pxl.h1.oef2;
import java.util.Scanner;

public class oef2
{
    public static void main(String[] args)
    {
        //initialise variables
        String name, playertype;
        double oldprice = 0, newprice = 0;
        int age = 0, avgrating = 0, amountofgoals = 0;

        //input variables
        Scanner input = new Scanner(System.in);

        System.out.println("naam speler: ");
        name = input.nextLine();
        System.out.println("prijs vorig seizoen: ");
        oldprice = input.nextDouble();
        System.out.println("leeftijd: ");
        age = input.nextInt();

        System.out.println("gemiddelde rating speler (0-10): ");
        do
        {
            avgrating = input.nextInt();
            if (avgrating > 10 || avgrating < 0)
                System.out.println("verkeerde input");
        }while (avgrating > 10 || avgrating < 0);

        System.out.println("type speler: ");

        System.out.println("aantal doelpunten: ");
        amountofgoals = input.nextInt();
        input.close();

        //calculations for newprice
        newprice = oldprice;

        if (age < 25)
            newprice += newprice * 0.1;
        else
        {
            if (age > 30)
                newprice -= newprice * 0.05;
        }



        //output
        System.out.println("naam: " + name);
        System.out.println("prijs vorig seizoen: " +oldprice);
        System.out.println("nieuwe prijs: " + newprice);




    }
}
