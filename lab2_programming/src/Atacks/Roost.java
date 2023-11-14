package Atacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Roost extends PhysicalMove {
    public Roost (){ super(Type.FLYING,0 ,100); }
    protected String describe(){return "Использует Roost";}

    @Override
    protected void applySelfDamage(Pokemon pokemon, double v) {
        super.applySelfDamage(pokemon, v - 53);
    }
}
