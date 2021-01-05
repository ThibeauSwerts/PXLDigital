package be.pxl.h5.oefB;

public class Pokemon {
    private String naam;
    private String type;

    public Pokemon(String naam, String type) {
        this.naam = naam;
        this.type = type;
    }


    public String getNaam() {
        return naam;
    }

    public String getType() {
        return type;
    }


    public String toString() {
        return naam + " (" + type + ")";
    }
}
