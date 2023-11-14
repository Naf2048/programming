package Atacks;

import ru.ifmo.se.pokemon.*;

public class Ice_beam extends SpecialMove {
    public Ice_beam(){
        super(Type.ICE, 90, 100);
    }

    protected String describe(){return "Использует Ice Beam";}

    protected void applyOppEffects(Pokemon p){
        Effect e = new Effect().chance(0.1).turns(1).condition(Status.FREEZE);
        p.addEffect(e);
    }
}