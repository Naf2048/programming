import Pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;


public class Main {public static void main(String[] args){
    Battle b = new Battle();
    Pokemon p1 = new Lugia("Lugia", 100);
    Pokemon p2 = new Riolu("Riolu", 40);
    Pokemon p3 = new Lucario("Lucario", 80);
    Pokemon p4 = new Ralts("Ralts", 20);
    Pokemon p5 = new Kirilia("Kirilia", 40);
    Pokemon p6 = new Gardevoir("Gardevoir", 80);
    b.addAlly(p1);
    b.addAlly(p2);
    b.addAlly(p3);
    b.addFoe(p4);
    b.addFoe(p5);
    b.addFoe(p6);
    b.go();
}
}