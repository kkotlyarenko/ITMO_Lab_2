package PokMoves;

import ru.ifmo.se.pokemon.Move;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MovesLVL{
    private static final Map<Class, Integer> map = new HashMap<>(Map.of(
            Blizzard.class, 5,
            DoubleTeam.class, 15,
            Endeavor.class, 5,
            Foresight.class, 40,
            HydroPump.class, 5,
            LovelyKiss.class, 10,
            MegaDrain.class, 15,
            Spikes.class, 20,
            SwordDance.class, 20,
            ThunderShock.class, 20));

    public static int findMinimalLvl(Move[] moves) {
        return Arrays.stream(moves).map(Object::getClass).mapToInt(map::get).max().orElse(-1);
    }
}
