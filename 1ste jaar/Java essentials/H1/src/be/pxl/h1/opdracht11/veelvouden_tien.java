package be.pxl.h1.opdracht11;

import java.util.Scanner;

public class veelvouden_tien {
    public static void main(String[] args) {
        // opdracht 1
        for (int i = 0; i <= 100; i += 10) {
            System.out.println(i);
        }
        System.out.println();

        // opdracht 2
        Scanner scanner = new Scanner(System.in);

        System.out.println("grootte driehoek");
        int grootte = scanner.nextInt();
        scanner.nextLine();

        System.out.println("beginletter");
        String karakater = scanner.nextLine();
        char letter = karakater.charAt(0);

        for (int i = 1; i <= grootte; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(letter + " ");

                letter++;   // zelfde als letter = (char) (letter + 1)
                if (letter > 'Z') {
                    letter = 'A';
                }
            }
            System.out.println();
        }
    }
}
