package Pokemons;

import Atacks.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Ralts extends Pokemon {
    public Ralts(String name, int level){
        super (name,level);
        setStats(28,25,25,45,35,40);
        setType(Type.PSYCHIC,Type.FAIRY);
        setMove(new Disarming_voice(),new Shadow_ball());
    }
}
