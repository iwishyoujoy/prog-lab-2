package Pokemons;

import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Luxio extends Shinx{
    public Luxio(String name, int level){
        super(name, level);
        setStats(60,85,49,60,49,60);
        setMove(new IceBeam());
    }

}
