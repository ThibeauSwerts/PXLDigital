package be.pxl.h1.opdracht12;

public class arrays {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        for (int i = 0; i < 20; i++) {
            numbers[i] = i * 7;

        }
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();

        int[] numbers2 = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        for (int n : numbers2) {
            System.out.print(n + " ");
        }
        System.out.println();

        for (int i = numbers2.length - 1; i >= 0; i--) {
            System.out.print(numbers2[i] + " ");
        }
    }
}
