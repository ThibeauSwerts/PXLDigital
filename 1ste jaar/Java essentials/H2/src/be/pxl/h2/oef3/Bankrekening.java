package be.pxl.h2.oef3;

import java.util.Scanner;

public class Bankrekening {
    private String rekeningNnummer;
    private String naam;
    private double rentePercentage;
    private double saldo;


    public Bankrekening() {
        this("geen", "onbekend", 1.2, 0);
    }

    public Bankrekening(String rekeningNnummer, String naam, double rentePercentage, double saldo) {
        this.rekeningNnummer = rekeningNnummer;
        this.naam = naam;
        setRentePercentage(rentePercentage);
        setSaldo(saldo);
    }


    public void setRentePercentage(double rentePercentage) {
        if (rentePercentage < 0) {
            rentePercentage = 0;
        }
        this.rentePercentage = rentePercentage;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            saldo = 0;
        }
        this.saldo = saldo;
    }

    public void setRekeningNnummer(String rekeningNnummer) {
        this.rekeningNnummer = rekeningNnummer;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }



    public double getSaldo() {
        return saldo;
    }


    public void stort(int bedrag) {
        if (checkGeldig()) {
            setSaldo(saldo + bedrag);
            System.out.println("na storting van " + bedrag + " euro");
            print();
        }
    }

    public void neemOp(int bedrag) {
        if (checkGeldig()) {
            if (saldo == 0) {
                System.out.println("u kan geen geld opnemen");
            }
            else if (bedrag > saldo) {
                System.out.println("u kan enkel " + saldo + " opnemen");
                setSaldo(0);
            }
            else {
                setSaldo(saldo - bedrag);
            }
            System.out.println("na opname van " + bedrag + " euro");
            print();
        }
    }

    public void doeVerrichting(int[] verrichtingen) {
        for (int verrichting : verrichtingen) {
            if (verrichting > 0) {
                stort(verrichting);
            }
            else {
                neemOp(-verrichting);
            }
        }
    }

    public void schrijfRenteBij() {
        if (checkGeldig()) {
            double rente = saldo * (rentePercentage / 100);
            setSaldo(saldo + rente);
            System.out.println("na rente van " + rente + " euro");
            print();
        }
    }


    public boolean checkGeldig() {
        // check op rekeningnr
        if (rekeningNnummer.equals("geen")) {
            System.out.println("sorry, geen rekeningnummer");
            return false;
        }
        // check op naam
        if (naam.equals("onbekend")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("geef uw naam");
            naam = scanner.nextLine();
            scanner.close();
        }
        return true;
    }

    public void print() {
        System.out.printf("Saldo op spaarrekening %s op naam van %s bedraagt %.2f euro%n", rekeningNnummer, naam, saldo);
    }
}
