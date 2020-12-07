package be.pxl.h1.oef7;
import java.util.Scanner;

public class oef7 {



    public static void main(String[] args) {
        //variable declaration

        int participantAmount = 0;
        int mostPoints = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Geef het aantal deelnemers:");
        participantAmount = input.nextInt();
        input.nextLine();

        String[] participants = new String[participantAmount];
        int[] points = new int[participantAmount];


        for (int i = 0; i < participantAmount; i++) {
            System.out.println("Geef naam van deelnemer " + (i + 1) + ":");
            participants[i] = input.nextLine();
        }

        for (int i = 0; i < participantAmount; i++) { // Voor elke deelnemer

            System.out.println("Punten voor " + participants[i]);

            for (int j = 0; j < participantAmount; j++) { // Vraag punten aan elke deelnemer

                if (i != j) {
                    System.out.println(participants[j] + " geef uw punten voor SFEER");
                    int punt = input.nextInt();
                    input.nextLine();

                    while (punt > 10 || punt < 0) {
                        System.out.println("Ongeldige punten!");
                        System.out.println(participants[j] + " geef uw punten voor SFEER");
                        punt = input.nextInt();
                        input.nextLine();
                    }
                    points[i] += punt;

                    System.out.println(participants[j] + " geef uw punten voor ETEN");
                    punt = input.nextInt();
                    input.nextLine();

                    while (punt > 10 || punt < 0) {
                        System.out.println("Ongeldige punten!");
                        System.out.println(participants[j] + " geef uw punten voor ETEN");
                        punt = input.nextInt();
                        input.nextLine();
                    }
                    points[i] += punt;
                }
            }
        }

        for (int i = 0; i < participantAmount; i++) { // Voor elke deelnemer
            System.out.println(participants[i] + " = " + points[i]);
            if (points[i] > points[mostPoints]) {
                mostPoints = i;
            }
        }

        System.out.println("Winnaar: " + participants[mostPoints]);
    }
}
