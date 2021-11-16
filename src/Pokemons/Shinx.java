package Pokemons;

import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Shinx extends Pokemon{
    public Shinx(String name, int level){
        super(name, level);
        setStats(45,65,34,40,34,45);
        setType(Type.ELECTRIC);
        setMove(new Swagger(), new Leer());
    }

}
