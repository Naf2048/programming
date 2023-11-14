package Atacks;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Dragon_pulse extends SpecialMove {
    public Dragon_pulse(){super (Type.DRAGON,85,100);}

    @Override
    protected String describe() {
        return "Использует Dragon Pulse";
    }
}
