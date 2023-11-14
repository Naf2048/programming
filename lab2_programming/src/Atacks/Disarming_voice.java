package Atacks;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Disarming_voice extends SpecialMove {
    public Disarming_voice(){super(Type.FAIRY,40,1000);}

    protected String describe(){return "Использует Disarming Voice";}
}
