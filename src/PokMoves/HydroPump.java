package PokMoves;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class HydroPump extends StatusMove {
    public HydroPump(){
        super(Type.WATER, 110, 80);
    }

    @Override
    protected String describe(){
        return "does " + getClass().getSimpleName();
    }
}
