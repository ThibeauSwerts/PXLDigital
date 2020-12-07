package be.pxl.h1.oef1;
import java.util.Scanner;

public class oef1
{
    public static void main(String[] args)
    {
        //intialise variables
        double length = 0,depth = 0,width = 0,m3 = 0, liter = 0, disinfectantperc = 0.02, disinfectantamount = 0;

        //input variables
        Scanner input = new Scanner(System.in);
        System.out.println("lengte zwembad: ");
        length = input.nextDouble();
        System.out.println("diepte zwembad: ");
        depth = input.nextDouble();
        System.out.println("breedte zwembad: ");
        width = input.nextDouble();
        input.close();

        //calculations of m3 liter and ontsmetting
        m3 = length * depth * width;
        liter = m3 * 1000;
        disinfectantamount = liter * disinfectantperc;
        liter -= disinfectantamount;


        //output liter and disinfectant
        System.out.println("er kan " + (int)liter + " liter water in het zwembad");
        System.out.println("er moet " + (int)disinfectantamount + " liter disinfectant in het zwembad bij gebruik van " + (int)liter + "liter water");
    }
}
