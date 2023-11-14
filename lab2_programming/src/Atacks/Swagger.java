package Atacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Swagger extends StatusMove {
    public Swagger(){super(Type.NORMAL,0,85);}

    protected String describe(){return "Использует Swagger";}

    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.ATTACK, 2);
    }
}

