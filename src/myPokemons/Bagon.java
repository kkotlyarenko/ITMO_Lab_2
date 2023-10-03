package myPokemons;

import PokMoves.*;
import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bagon extends Pokemon{
    public Bagon(){
        super("Bagon", 0);
        setType(Type.DRAGON);
        setStats(45, 75, 60, 40, 30, 50);

        Move[] moves = new Move[]{new SwordDance(), new MegaDrain(), new Spikes(), new LovelyKiss()};
        setMove(moves);
        setLevel(MovesLVL.findMinimalLvl(moves));
    }
}