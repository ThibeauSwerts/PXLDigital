package be.pxl.h3.opdracht8;

public class opdracht8 {
    public static void main(String[] args) {
        String artikel = "fb12";

        if (Character.isLetter(artikel.charAt(0)) && Character.isLetter(artikel.charAt(1)) && Character.isDigit(artikel.charAt(2)) && Character.isDigit(artikel.charAt(3))) {
            System.out.println("juiste code");
        }
        else {
            System.out.println("fout");
        }

        //of

        boolean geldig = true;
        for (int i = 0; i < artikel.length(); i++) {
            char karakter = artikel.charAt(i);
            if (i <= 1) {
                if (!Character.isLetter(karakter)) {
                    geldig = false;
                    break;
                }
            }
            else if (!Character.isDigit(karakter)) {
                geldig = false;
                break;
            }
        }
        if (geldig) {
            System.out.println("juiste code");

           /* opdracht 9
            char eerste = Character.toUpperCase(artikel.charAt(0));
            StringBuilder builder = new StringBuilder();
            builder.append(eerste);
            builder.append(artikel.substring(1));
            artikel = builder.toString();
            System.out.println(artikel);*/

            char eerste = Character.toUpperCase(artikel.charAt(0));
            artikel = eerste + artikel.substring(1);
            System.out.println(artikel);
        }
        else {
            System.out.println("fout");
        }
    }
}
