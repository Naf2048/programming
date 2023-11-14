package Pokemons;

import Atacks.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Riolu extends Pokemon {
    public Riolu(String name , int level){
        super(name,level);
        setStats(40,70,40,35,40,60);
        setType(Type.FIGHTING);
        setMove(new Swagger(),new Facade(), new Confide());
    }
}
