package be.pxl.h1.oef2;
import java.util.Scanner;

public class oef2
{
    public static void main(String[] args)
    {
        //initialise variables
        String name;
        double oldprice = 0, newprice = 0;
        int age = 0, avgrating = 0, amountofgoals = 0, playertype = 0;

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

        System.out.println("geef het type speler druk 1 voor aanvaller, druk 2 voor middenvelder, druk 3 voor verdediger, druk 4 voor doelman: ");
        do
        {
            playertype = input.nextInt();
            if (playertype > 10 || playertype < 0)
                System.out.println("verkeerde input");
        }while (playertype > 4 || playertype < 0);

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
        //aanvaller verhoging
        if (playertype == 1)
        {
            if (amountofgoals > 5)
            {
                newprice += ((amountofgoals - 5) * 20000) + 50000;
            }
            else
            {
                newprice += 10000 * amountofgoals;
            }
        }
        // middenvelder, verdedigers en doelman verhogen
        if (playertype == 2 || playertype == 3 || playertype == 4)
        {
            newprice += 10000 * avgrating;
        }
        // doelman verlaging
        if (playertype == 4)
        {
            if (amountofgoals > 20)
            {
                amountofgoals -= 20;
                for (int i = 0; i < amountofgoals; i++)
                {
                    if (newprice > 9000)//safety so the price can't go below 0
                    {
                        newprice -= 9000;
                    }
                    else
                    {
                        newprice -= newprice;
                    }
                }
            }
        }
        //output
        System.out.println("naam: " + name);
        System.out.println("prijs vorig seizoen: " +oldprice);
        System.out.println("nieuwe prijs: " + newprice);
    }
}