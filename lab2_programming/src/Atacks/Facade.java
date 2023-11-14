package Atacks;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade(){
        super(Type.NORMAL, 70,100);
    }

    protected String describe(){
        return "использует Facade";
    }

    protected void applySelfEffects(Pokemon p){
        Effect e = new Effect();
        if (p.getCondition().equals(Status.PARALYZE) || p.getCondition().equals(Status.BURN) || p.getCondition().equals(Status.POISON)){
            this.power *= 2;
        }
        p.addEffect(e);
    }
}

