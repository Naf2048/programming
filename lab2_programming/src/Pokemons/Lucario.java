package Pokemons;

import Atacks.Dragon_pulse;
import ru.ifmo.se.pokemon.Type;

public class Lucario extends Riolu {
    public Lucario(String name, int level) {
        super(name, level);
        setStats(70,110,70,115,70,90);
        setType(Type.FIGHTING,Type.STEEL);
        setMove(new Dragon_pulse());
    }

}
