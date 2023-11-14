package Atacks;

import ru.ifmo.se.pokemon.*;

public class Shadow_ball extends SpecialMove {
    public Shadow_ball(){super(Type.GHOST,80,100);}

    protected String describe(){return "Использует Shadow Ball";}

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect e = new Effect().chance(0.2).stat(Stat.SPECIAL_DEFENSE,-1);
        pokemon.addEffect(e);
    }
}
