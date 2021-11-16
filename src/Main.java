import ru.ifmo.se.pokemon.*;
import Pokemons.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Miltank("Даша", 5);
        Pokemon p2 = new Ledian("Настя", 5);
        Pokemon p3 = new Luxray("Ваня", 5);
        Pokemon p4 = new Luxio("Дима", 5);
        Pokemon p5 = new Shinx("Костя", 5);
        Pokemon p6 = new Ledyba("Никита", 5);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}
