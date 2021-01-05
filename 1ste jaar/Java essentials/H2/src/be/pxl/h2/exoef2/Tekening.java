package be.pxl.h2.exoef2;

public class Tekening {

    public void tekenDriehoek(int grootte, char teken) {
        for (int i = 1; i <= grootte; i++) {
            for (int j = 1; j <= grootte - i; j++) {
                System.out.print(" ");
            }
            for (int k = grootte - i + 1; k <= grootte; k++) {
                System.out.print(teken);
            }
            System.out.println();
        }
    }

    public void tekenRechthoekVol(int breedte, int hoogte) {
        for (int i = 1; i <= hoogte; i++) {
            for (int j = 1; j <= breedte; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void tekenRechthoekLeeg(int breedte, int hoogte) {
        for (int j = 1; j <= breedte; j++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 2; i < hoogte; i++) {
            System.out.print("*");
            for (int j = 2; j < breedte; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int j = 1; j <= breedte; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
