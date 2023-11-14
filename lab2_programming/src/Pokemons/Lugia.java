package Pokemons;

import Atacks.*;
import ru.ifmo.se.pokemon.*;

public class Lugia extends Pokemon {
    public Lugia(String name,int level){
        super(name,level);
        setStats(106,90,130,90,154,110);
        setType(Type.FLYING,Type.PSYCHIC);
        setMove(new Thunder(),new Roost(),new Aerial_ace(),new Ice_beam());
    }
}
