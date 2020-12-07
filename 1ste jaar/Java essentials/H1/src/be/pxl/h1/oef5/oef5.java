package be.pxl.h1.oef5;
import java.util.Scanner;

public class oef5
{
    public static void main(String[] args)
    {
        //initialise variables
        int stars = 0;
        double nightPrice = 0, totalprice = 0,priceForChild = 0;


        //input of variables
        Scanner scanner = new Scanner(System.in);
        System.out.println("hotelcode: ");
        String hotelcode = scanner.nextLine();

        while (!hotelcode.equals("/")) {
            System.out.println("aantal sterren: ");
            stars = scanner.nextInt();
            scanner.nextLine();
            System.out.println("kindercode: ");
            String kindercode = scanner.nextLine();

            //calculations for price
            if (stars <= 2) {
                nightPrice = 48;
            } else if (stars == 3) {
                if (hotelcode.equals("BR") | hotelcode.equals("AN")) {
                    nightPrice = 60;
                } else {
                    nightPrice = 56;
                }
            } else {
                nightPrice = 60;
            }

            if (hotelcode.equals("HI")) {
                nightPrice = 70;
            }

            if (kindercode.equals("A")) {
                if (stars <= 2 | hotelcode.equals("HA")) {
                    priceForChild = 0;
                } else {
                    priceForChild = nightPrice / 2;
                }
            }
            totalprice = priceForChild + nightPrice;

            //search for hotel + output
            System.out.println("\nhotelcode: ");
            hotelcode = scanner.nextLine();

            System.out.println(hotelcode + " ");
            for (int i = 0; i < stars; i++){
                System.out.println("*");
            }
            System.out.println(" " + nightPrice + " "+ priceForChild + " " + totalprice);
        }

    }
}
