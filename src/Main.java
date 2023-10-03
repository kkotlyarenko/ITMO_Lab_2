import myPokemons.*;
import ru.ifmo.se.pokemon.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Battle battle = new Battle();

        // load and shuffle pokemons
        List<Pokemon> pokemons = new ArrayList<>(List.of(new Bagon(), new Bibarel(), new Bidoof(), new Ludicolo(), new Mankey(), new Staraptor()));
        Collections.shuffle(pokemons);

        // print loaded pokemons
        System.out.println(" > POKEMONS LOADED > ");
        for(Pokemon p : pokemons){
            System.out.printf( "[%d] %s %n", p.getLevel(), p.getClass().getSimpleName());
        }
        System.out.println();

        // add to commands
        for (int i = 0; i < pokemons.size(); i++)
            if (i % 2 == 0)
                battle.addFoe(pokemons.get(i));
            else
                battle.addAlly(pokemons.get(i));

        battle.go();

    }
}