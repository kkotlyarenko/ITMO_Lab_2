package myPokemons;

import PokMoves.*;
import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Mankey extends Pokemon{
    public Mankey(){
        super("Mankey", 0);
        setType(Type.FIGHTING);
        setStats(40, 80, 35, 35, 45, 70);

        Move[] moves = new Move[]{new HydroPump(), new Endeavor(), new ThunderShock(), new Foresight()};
        setMove(moves);
        setLevel(MovesLVL.findMinimalLvl(moves));
    }
}