package Moves;

import ru.ifmo.se.pokemon.*;

public class Lick extends PhysicalMove{ //lick - облизывать
    public Lick(){
        super(Type.GHOST, 30, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random()<0.3){
            Effect.paralyze(p);
        }
    }

    @Override
    protected String describe(){
        return "облизывает";
    }
    //Electric type Pokémon, those with the ability Limber or those behind a Substitute cannot be paralyzed.

}
