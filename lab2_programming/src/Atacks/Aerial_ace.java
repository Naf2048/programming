package Atacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Aerial_ace extends PhysicalMove {
    public Aerial_ace(){super(Type.FLYING,60,1000);}

    protected String describe(){return "Aerial Ace";}
}
