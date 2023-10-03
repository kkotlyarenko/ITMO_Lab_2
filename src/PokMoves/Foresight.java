package PokMoves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Foresight extends StatusMove {
    public Foresight(){
        super(Type.NORMAL, 0, 0);
    }
    @Override
    protected String describe(){
        return "does " + getClass().getSimpleName();
    }
}
