package be.pxl.h1.oef6;

import java.util.Scanner;

public class oef6
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char [] characters = {'z','b','r','o','g','G','B','V','L','W'};
        char [] code = new char[3];
        int[] values = new int[3];

        System.out.println("Eerste letter");
        code[0] = input.nextLine().charAt(0);

        System.out.println("Tweede letter");
        code[1] = input.nextLine().charAt(0);

        System.out.println("Derde letter");
        code[2] = input.nextLine().charAt(0);

        for (int i = 0; i < code.length; i++)
        {
            for(int j=0; j < characters.length; j++)
            {
                if (code[i] == characters[j])
                {
                    values[i] = j;
                }
            }
        }

        boolean valid = true;
        for (int w : values)
        {
            if (w == -1)
            {
                valid = false;
            }
        }
        if (valid)
        {
            double r = (10 * values[0] + values[1] + Math.pow(10, values[2]));
            System.out.println("Weerstand: " + r);
        }
        else
        {
            System.out.println("Geen geldige karakters");
        }

    }
}
