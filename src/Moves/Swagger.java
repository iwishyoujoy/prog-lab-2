package Moves;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove{ //swagger - щегольство
    public Swagger() {
        super(Type.NORMAL, 0, 85);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        //добавить про вероятность, зависящую от поколения покемона
        Effect.confuse(p);
        Effect e = new Effect().stat(Stat.ATTACK, +2);
        //Pokémon with the ability Own Tempo or those behind a Substitute cannot be confused.
        p.addEffect(e);
    }

    @Override
    protected String describe(){
        return "щеголяет";
    }

}
