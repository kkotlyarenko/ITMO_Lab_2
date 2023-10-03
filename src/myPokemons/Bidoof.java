package myPokemons;

import PokMoves.*;
import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bidoof extends Pokemon{
    public Bidoof(){
        super("Bidoof", 0);
            setType(Type.NORMAL);
        setStats(59, 45, 40, 35, 40, 31);

        Move[] moves = new Move[]{new ThunderShock(), new HydroPump(), new DoubleTeam()};
        setMove(moves);
        setLevel(MovesLVL.findMinimalLvl(moves));
    }
}