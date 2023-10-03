package myPokemons;

import PokMoves.*;
import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Staraptor extends Pokemon{
    public Staraptor(){
        super("Staraptor", 0);
        setType(Type.NORMAL, Type.FLYING);
        setStats(85, 120, 70, 50, 60, 100);

        Move[] moves = new Move[]{new ThunderShock(), new HydroPump()};
        setMove(moves);
        setLevel(MovesLVL.findMinimalLvl(moves));
    }
}