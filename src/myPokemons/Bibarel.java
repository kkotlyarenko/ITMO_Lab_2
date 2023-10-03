package myPokemons;

import PokMoves.*;
import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bibarel extends Pokemon{
    public Bibarel(){
        super("Bibarel", 0);
        setType(Type.NORMAL, Type.WATER);
        setStats(79, 85, 60, 55, 60, 71);

        Move[] moves = new Move[]{new ThunderShock(), new HydroPump(), new DoubleTeam(), new Blizzard()};
        setMove(moves);
        setLevel(MovesLVL.findMinimalLvl(moves));
    }
}