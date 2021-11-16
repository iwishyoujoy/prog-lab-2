package Moves;

import ru.ifmo.se.pokemon.*;

public class SludgeBomb extends SpecialMove{ //sludge bomb - бомба слизи
    public SludgeBomb() {
        super(Type.POISON, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random()<0.3){
            Effect.poison(p);
        }
    }

    @Override
    protected String describe(){
        return "кидает бомбу из слизи";
    }
    //Poison or Steel type Pokémon, those with the ability Immunity or those behind a Substitute cannot be poisoned.

}
