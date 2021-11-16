package Moves;

import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove{ //confide - довериться
    public Confide() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        Effect e = new Effect().stat(Stat.SPECIAL_ATTACK, -1);
        p.addEffect(e);
    }

    @Override
    protected String describe(){
        return "делится секретом";
    }
}
