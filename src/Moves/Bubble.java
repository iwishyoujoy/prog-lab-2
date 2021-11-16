package Moves;

import ru.ifmo.se.pokemon.*;

public class Bubble extends SpecialMove{
    public Bubble() {
        super(Type.WATER, 40, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        Effect e = new Effect().chance(0.1).stat(Stat.SPEED, -1);
        p.addEffect(e);
    }

    @Override
    protected String describe(){
        return "пускает пузыри";
    }

}
