package ru.erius.lab2.pokemon;

import ru.erius.lab2.move.status.Swagger;
import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Type;

import java.util.Collections;
import java.util.List;

public class Blaziken extends Combusken {

    protected final static String NAME = "Blaziken";
    protected final static List<Type> TYPES = Collections.emptyList();
    protected final static double
            HP = 60.0D, ATTACK = 85.0D, DEFENSE = 60.0D,
            SP_ATK = 85.0D, SP_DEF = 60.0D, SPEED = 55.0D;
    protected final static List<Move> MOVES = Collections.singletonList(new Swagger());

    public Blaziken(String name, int lvl) {
        super(name, lvl);
        this.setStats(HP, ATTACK, DEFENSE, SP_ATK, SP_DEF, SPEED);
        TYPES.forEach(this::addType);
        MOVES.forEach(this::addMove);
    }

    public Blaziken(int lvl) {
        super(lvl);
    }

    public Blaziken() {
        super();
    }
}
