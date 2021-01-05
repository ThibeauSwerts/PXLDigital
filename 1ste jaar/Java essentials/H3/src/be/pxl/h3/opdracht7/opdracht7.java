package be.pxl.h3.opdracht7;

public class opdracht7 {
    public static void main(String[] args) {
        // a
        String tekst = "bananentaarten!";
        System.out.println(tekst + "--" + tekst.length());

        // b
        System.out.println(tekst.replace("a", "o"));

        // c
        int count = 0;
        for (char letter : tekst.toCharArray()) {
            if (letter == 'e') { // omdat we met char werken gaat "==" hier en hebben we geen .equals() nodig
                count++;
            }
        }

        System.out.println(count + " e's gevonden");

        // d
        String andere = "hello there";
        boolean uitkomst = tekst.equals(andere);
        System.out.println(uitkomst);

        // e
        int mid = tekst.length() / 2;
        int aantal = 1;
        if (tekst.length() % 2 == 0) {
            mid--;
            aantal = 2;
        }
        String selectie = tekst.substring(0, mid) +
                tekst.substring(mid, mid + aantal).toUpperCase() +
                tekst.substring(mid + aantal);
        System.out.println(selectie);
    }
}
