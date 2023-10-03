package PokMoves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class SwordDance  extends StatusMove {
    public SwordDance(){
        super(Type.NORMAL, 0, 0);
    }
    @Override
    protected String describe(){
        return "does " + getClass().getSimpleName();
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        //Swords Dance raises the user's Attack by two stages.
        //Stats can be raised to a maximum of +6 stages each.
    }
}
