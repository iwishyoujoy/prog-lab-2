package Moves;

import ru.ifmo.se.pokemon.*;

public class Stomp extends PhysicalMove{ //stomp - затаптывание
    public Stomp(){
        super(Type.NORMAL, 65, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random()<0.3){
            Effect.flinch(p);
        }
    }
    //Pokémon with the ability Inner Focus or those behind a Substitute cannot be made to flinch.
    //If the target has used Minimize, Stomp ignores accuracy and deals double damage.
    @Override
    protected String describe(){
        return "пытается затоптать соперника";
    }
}
