package ru.erius.lab2.pokemon;

import ru.erius.lab2.move.status.Leer;
import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Type;

import java.util.Collections;
import java.util.List;

public class Gliscor extends Gligar {

    protected final static String NAME = "Gliscor";
    protected final static List<Type> TYPES = Collections.emptyList();
    protected final static double
            HP = 75.0D, ATTACK = 95.0D, DEFENSE = 125.0D,
            SP_ATK = 45.0D, SP_DEF = 75.0D, SPEED = 95.0D;
    protected final static List<Move> MOVES = Collections.singletonList(new Leer());

    public Gliscor(String name, int lvl) {
        super(name, lvl);
        this.setStats(HP, ATTACK, DEFENSE, SP_ATK, SP_DEF, SPEED);
        TYPES.forEach(this::addType);
        MOVES.forEach(this::addMove);
    }

    public Gliscor(int lvl) {
        super(lvl);
    }

    public Gliscor() {
        super();
    }
}
