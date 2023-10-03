package myPokemons;

import PokMoves.*;
import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Ludicolo extends Pokemon{
    public Ludicolo(){
        super("Ludicolo", 0);
        setType(Type.WATER, Type.GRASS);
        setStats(80, 70, 70, 90, 100, 70);

        Move[] moves = new Move[]{new HydroPump(), new Endeavor(), new ThunderShock()};
        setMove(moves);
        setLevel(MovesLVL.findMinimalLvl(moves));
    }
}