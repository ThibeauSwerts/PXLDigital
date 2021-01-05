package be.pxl.h8.opdracht4;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<String> lijst = new ArrayList<>();

        String voorbeeld1 = "voorbeeld1";
        String voorbeeld4 = "voorbeeld4";

        lijst.add(voorbeeld1);
        lijst.add("voorbeeld2");
        lijst.add("voorbeeld3");
        lijst.add(1,voorbeeld4);
        lijst.forEach((n) -> System.out.println(n));
        lijst.remove(1);
        lijst.forEach((n) -> System.out.println(n));

    }
}
