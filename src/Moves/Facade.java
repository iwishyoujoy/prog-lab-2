package Moves;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove { //lick - облизывать
    public Facade(){
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        if ((def.getCondition()==Status.BURN)||(def.getCondition()==Status.POISON)||(def.getCondition()==Status.PARALYZE)){
            def.setMod(Stat.HP, (int) Math.round(damage*2));
        }
    }

    @Override
    protected String describe(){
        return "наносит удар мужества";
    }
}
