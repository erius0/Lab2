package ru.erius.lab2.pokemon;

import ru.erius.lab2.move.status.Supersonic;
import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Type;

import java.util.Collections;
import java.util.List;

public class Combusken extends Torchic {

    protected final static String NAME = "Combusken";
    protected final static List<Type> TYPES = Collections.singletonList(Type.FIGHTING);
    protected final static double
            HP = 60.0D, ATTACK = 85.0D, DEFENSE = 60.0D,
            SP_ATK = 85.0D, SP_DEF = 60.0D, SPEED = 55.0D;
    protected final static List<Move> MOVES = Collections.singletonList(new Supersonic());

    public Combusken(String name, int lvl) {
        super(name, lvl);
        this.setStats(HP, ATTACK, DEFENSE, SP_ATK, SP_DEF, SPEED);
        TYPES.forEach(this::addType);
        MOVES.forEach(this::addMove);
    }

    public Combusken(int lvl) {
        super(lvl);
    }

    public Combusken() {
        super();
    }
}
