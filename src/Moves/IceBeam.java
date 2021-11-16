package Moves;

import ru.ifmo.se.pokemon.*;

public class IceBeam extends SpecialMove { // ice beam - ледяной луч
    public IceBeam() {
        super(Type.ICE, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random()<0.1){
            Effect.freeze(p);
        }
    }
    //Ice type Pokémon, those with the ability Magma Armor or those behind a Substitute cannot be frozen.
    @Override
    protected String describe(){
        return "стреляет ледяным лучом";
    }
}
