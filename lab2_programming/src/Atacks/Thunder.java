package Atacks;

import ru.ifmo.se.pokemon.*;

public class Thunder extends SpecialMove {
    public Thunder(){super(Type.ELECTRIC,110,70);}

    protected String describe(){return "использует Thunder";}

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect e = new Effect().chance(0.3).turns(1).condition(Status.PARALYZE);
        pokemon.addEffect(e);
    }
}
