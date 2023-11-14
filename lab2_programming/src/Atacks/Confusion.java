package Atacks;

import ru.ifmo.se.pokemon.*;

public class Confusion extends SpecialMove {
    public Confusion(){super(Type.PSYCHIC,50,100);}

    @Override
    protected String describe() {
        return "Использует Confusion";

    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (new Effect().chance(0.1).success()){
            pokemon.confuse();
        }
    }
}
