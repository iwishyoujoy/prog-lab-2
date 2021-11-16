package Moves;

import ru.ifmo.se.pokemon.*;

public class Crabhammer extends PhysicalMove { //lick - облизывать
    public Crabhammer(){
        super(Type.WATER, 100, 90);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.SPEED, 4); //has an increased critical hit ratio (1⁄8 instead of 1⁄24)
    }

    @Override
    protected String describe(){
        return "сокрушает огромную клешню";
    }
}
