package Moves;

import ru.ifmo.se.pokemon.*;

public class Thunder extends SpecialMove {
    public Thunder() {
        super(Type.ELECTRIC, 110, 70);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random()<0.3){
            Effect.paralyze(p);
        }
    }
    //Electric type Pokémon, those with the ability Limber or those behind a Substitute cannot be paralyzed.
    //If used during rain, Thunder ignores accuracy. Conversely, if used during intense sunlight, its accuracy drops to 50%.
    //Thunder can hit Pokémon during the first stage of Bounce, Fly or Sky Drop.
    @Override
    protected String describe(){
        return "вызывает гром";
    }
}
