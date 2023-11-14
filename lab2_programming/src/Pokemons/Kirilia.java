package Pokemons;

import Atacks.Charm;
import ru.ifmo.se.pokemon.Type;

public class Kirilia extends Ralts{

    public Kirilia(String name, int level) {
        super(name, level);
        setStats(38,35,35,65,55,50);
        setType(Type.PSYCHIC,Type.FAIRY);
        setMove(new Charm());
    }
}
