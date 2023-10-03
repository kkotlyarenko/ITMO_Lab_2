package PokMoves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class MegaDrain extends SpecialMove{
    public MegaDrain(){
        super(Type.GRASS, 40, 100);
    }

    @Override
    protected String describe(){
        return "does " + getClass().getSimpleName();
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        //Mega Drain deals damage and the user will recover 50% of the HP drained.
    }
}