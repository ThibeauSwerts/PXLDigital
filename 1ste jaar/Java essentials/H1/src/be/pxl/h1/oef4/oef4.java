package be.pxl.h1.oef4;
import java.util.Scanner;

public class oef4
{
    public static void main(String[] args) {
        //variable declaration
        int goodSales = 0, salesrepamount = 0,number = 0;
        double amount = 0, wage = 0;

        //input and calculations
        Scanner scanner = new Scanner(System.in);
        System.out.println("nummer vertegenwoordiger (4 cijfers):");
        number = scanner.nextInt();
        scanner.nextLine();

        while (number < 9000) {
            System.out.println("verkochte bedrag:");
            amount = scanner.nextDouble();
            scanner.nextLine();

            salesrepamount += 1;

            wage = 25000;

            if (amount < 50000) {
                wage += wage * .05;
            }
            else if (50000 <= amount && amount < 75000) {
                wage += wage * .1;
            }
            else {
                wage += wage * .15;
                goodSales += 1;
            }
            System.out.println("verkoper: " + number + "\nverkochte bedrag: " + amount + "\nloon:" + wage);
            System.out.println("\nnummer vertegenwoordiger (4 cijfers):");
            number = scanner.nextInt();
            scanner.nextLine();
        }
        //final output
        double percentage = (double) goodSales / salesrepamount * 100;
        System.out.println(percentage + "% van de verkopers verkocht voor >75000");
    }
}
