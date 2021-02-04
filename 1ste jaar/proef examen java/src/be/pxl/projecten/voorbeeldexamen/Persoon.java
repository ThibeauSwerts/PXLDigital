package be.pxl.projecten.voorbeeldexamen;

import java.util.Objects;

public abstract class Persoon {
    private String id;
    private String naam;

    public Persoon(String id, String naam) {
        StringBuilder idBuilder = new StringBuilder();
        for (int i = 0; i < id.length(); i++) {
            char c = id.charAt(i);
            if (Character.isDigit(c) || Character.isAlphabetic(c)) {
                idBuilder.append(c);
            }
        }
        id = idBuilder.toString();
        if (id.length() > 3) {
            id = id.substring(0, 3);
        }
        this.id = id.toUpperCase();
        this.naam = naam;
    }


    public String getId() {
        return id;
    }

    public String getNaam() {
        return naam;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persoon persoon = (Persoon) o;
        return id.equals(persoon.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, naam);
    }

    @Override
    public String toString() {
        return "[" + id + "] " + naam;
    }
}
