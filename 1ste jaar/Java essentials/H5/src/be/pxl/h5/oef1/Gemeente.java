package be.pxl.h5.oef1;

public class Gemeente {
    private int postcode;
    private String gemeenteNaam;


    public Gemeente(int postcode, String gemeenteNaam) {
        setPostcode(postcode);
        setGemeenteNaam(gemeenteNaam);
    }



    public void setPostcode(int postcode) {
        // alt:
        // String nummer = String.valueOf(postcode);
        // bewerkingen
        // int omgezet = Integer.parseInt(nummer);
        while (postcode > 9999) {
            postcode /= 10;
        }
        while (postcode < 1000) {
            postcode *= 10;
        }
        this.postcode = postcode;
    }

    public void setGemeenteNaam(String gemeenteNaam) {
        StringBuilder builder = new StringBuilder();
        char vorige = '.';
        for (int i = 0; i < gemeenteNaam.length(); i++) {
            char karakter = gemeenteNaam.charAt(i);
            if (!Character.isDigit(karakter)) {
                if (builder.length() == 0) {
                    builder.append(Character.toUpperCase(karakter));
                }
                else if (vorige == '-' || vorige == ' ') {
                    builder.append(karakter);
                }
                else {
                    builder.append(Character.toLowerCase(karakter));
                }
            }
            vorige = karakter;
        }
        this.gemeenteNaam = builder.toString();
    }



    public int getPostcode() {
        return postcode;
    }

    public String getGemeenteNaam() {
        return gemeenteNaam;
    }


    public String toString() {
        return postcode + " " + gemeenteNaam;
    }
}
