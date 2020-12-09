package be.pxl.h2.oef3;

import java.util.Scanner;

public class Bankrekening
{
    private String rekeningNummer;
    private String naam;
    private double rentePercentage;
    private double saldo;

    public Bankrekening()
    {
        this("geen", "onbekend", 1.2, 0);
    }

    public Bankrekening(String rekeningNummer, String naam, double rentePercentage, double saldo)
    {
        this.rekeningNummer = rekeningNummer;
        this.naam = naam;
        setRentePercentage(rentePercentage);
        setSaldo(saldo);
    }

    public void setRentePercentage(double rentePercentage) {
        if(rentePercentage < 0)
        {
            this.rentePercentage = 0;
        }
        else
        {
            this.rentePercentage = rentePercentage;
        }
    }

    public void setSaldo(double saldo)
    {
        if (saldo <0)
        {
            this.saldo = 0;
        }
        else
        {

            this.saldo = saldo;
        }
    }

    public double getSaldo()
    {
        return saldo;
    }

    public void stort(int bedrag)
    {
        boolean geldig = checkGeldig();
        setSaldo(saldo + bedrag);
    }

    public void neemOp(int bedrag)
    {
        if(saldo == 0)
        {
            System.out.println("U kan geen geld opnemen");
        }
        else if (bedrag > this.saldo)
        {
            System.out.println("U mag enkel "+ saldo +"  euro opnemen");
            setSaldo(0);
        }
        else
        {
            setSaldo(saldo - bedrag);
        }
    }

    public void doeVerrichting(int [] verrichtingen)
    {
        for(int verrichting : verrichtingen)
        {
            if (verrichting > 0)
            {
                stort(verrichting);
            }
            else
            {
                neemOp(-verrichting);
            }
        }
    }
    public void schrijRenteBij()
    {
        double rente = saldo * (rentePercentage / 100);
        setSaldo(saldo + rente);
    }

    public boolean checkGeldig()
    {
        //check op rekeningnummer
        if (rekeningNummer.equals("geen") )
        {
            System.out.println("sorry geen rekeningnummer");
            return false;
        }

        //check op naam
        if (naam.equals("onbekend") )
        {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Geef uw naam aub");
            naam = scanner.nextLine();
            scanner.close();
        }
        return true;
    }

    public void print()
    {
        System.out.printf("Saldo op spaarrekening %s op naam van %s bedraaft %.2f euro%n", rekeningNummer, naam, saldo);
    }
}
