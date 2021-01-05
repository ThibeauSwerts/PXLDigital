package be.pxl.h5.oefB;

public class Pokedex {
    private Pokemon[] pokedex;

    public Pokedex(int grootte) {
        Pokemon[] pokedex = new Pokemon[grootte];
    }


    public Pokemon[] getPokemon() {
        return pokedex;
    }


    public boolean bevat(Pokemon gezochtePokemon) {
        for (Pokemon pokemon : pokedex) {
            if (gezochtePokemon.getNaam().equals(pokemon.getNaam())) {
                return true;
            }
        }
        return false;
    }

    public void voegToe(Pokemon nieuwePokemon) {
        for (int i = 0; i < pokedex.length; i++) {
            if (pokedex[i].equals(null)) {
                pokedex[i] = nieuwePokemon;
            }
        }
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Pokemon pokemon : pokedex) {
            builder.append("- ").append(pokemon.toString()).append("\n");
        }
        return builder.toString();
    }
}
