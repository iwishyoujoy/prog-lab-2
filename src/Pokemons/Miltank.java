package Pokemons;

import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Miltank extends Pokemon{
    public Miltank(String name, int level){
        super(name, level);
        setStats(95,80,105,40,70,100);
        setType(Type.NORMAL);
        setMove(new Crabhammer(), new Stomp(), new Confide(), new Bubble());
    }
}
