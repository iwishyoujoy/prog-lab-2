package Moves;

import ru.ifmo.se.pokemon.*;

public class Leer extends StatusMove{ //leer - злой взгляд
    public Leer() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        Effect e = new Effect().stat(Stat.DEFENSE, -1);
        p.addEffect(e);
    }

    @Override
    protected String describe(){
        return "страшно пялится";
    }
}
