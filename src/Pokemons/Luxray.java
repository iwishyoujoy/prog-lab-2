package Pokemons;

import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Luxray extends Luxio{
    public Luxray(String name, int level){
        super(name, level);
        setStats(80,120,79,95,79,70);
        setMove(new Facade());
    }
}
