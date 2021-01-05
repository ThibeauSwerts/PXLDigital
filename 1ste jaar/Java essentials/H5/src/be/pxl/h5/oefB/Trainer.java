package be.pxl.h5.oefB;

public class Trainer {
    private Pokedex pokedex;
    private String naam;

    public Trainer(String naam) {
        this.naam = naam;
        this.pokedex = new Pokedex(10);
    }


    public Pokedex getPokedex() {
        return pokedex;
    }

    public String getNaam() {
        return naam;
    }


    public void vangPokemon(Pokemon gevangenPokemon) {
        if (!pokedex.bevat(gevangenPokemon)) {
            pokedex.voegToe(gevangenPokemon);
        }
        else {
            System.out.println("pokemon zit al in de pokedex");
        }
    }

    public String toString() {
        return naam;
    }
}
