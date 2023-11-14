package Pokemons;

import ru.ifmo.se.pokemon.Type;
import Atacks.Confusion;
public class Gardevoir extends Kirilia{
    public Gardevoir(String name, int level) {
        super(name, level);
        setStats(68,65,65,125,115,80);
        setType(Type.PSYCHIC,Type.FAIRY);
        setMove(new Confusion());
    }
}
