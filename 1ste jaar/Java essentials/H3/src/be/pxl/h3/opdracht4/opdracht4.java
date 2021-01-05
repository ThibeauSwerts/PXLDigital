package be.pxl.h3.opdracht4;

import java.util.Random;

public class opdracht4 {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int x = rand.nextInt(11) + 20; // geen andere builtin methode voor lmao
            System.out.println(x);
        }
        int c = rand.nextInt(26) + 97;
        char letter = (char) c;
        System.out.println(letter);
    }



}
