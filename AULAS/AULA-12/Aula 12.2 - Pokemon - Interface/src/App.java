import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Pokemon> pokemons = new ArrayList<Pokemon>();

        pokemons.add(new PokemonGrama(1, "Bulbasaur", new Status(10, 10, 10, 10)));

        pokemons.add(new PokemonFogo(4, "Charmander", new Status(10, 20, 5, 5)));

        pokemons.add(new PokemonAgua(7, "Squirtle", new Status(10, 5, 20, 5)));

        mostraPokemons(pokemons);
        evoluirTodos(pokemons, new Status(1, 1, 1, 1));
        mostraPokemons(pokemons);
    }

    public static void mostraPokemons(List<Pokemon> pokemons){
        for (Pokemon pokemon : pokemons) {
            System.out.println(pokemon);
        }
    }

    public static void evoluirTodos(List<Pokemon> pokemons, Status status){
        for (Pokemon pokemon : pokemons) {
            pokemon.evoluir(status);
        }
    }
}
