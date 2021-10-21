package ru.erius.lab2.pokemon;

import ru.erius.lab2.move.status.DoubleTeam;
import ru.erius.lab2.move.status.Rest;
import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

import java.util.*;

public class Torchic extends Pokemon {

    protected final static String NAME = "Torchic";
    protected final static List<Type> TYPES = Collections.singletonList(Type.FIRE);
    protected final static double
            HP = 45.0D, ATTACK = 60.0D, DEFENSE = 40.0D,
            SP_ATK = 70.0D, SP_DEF = 50.0D, SPEED = 45.0D;
    protected final static List<Move> MOVES = Arrays.asList(new DoubleTeam(), new Rest());

    public Torchic(String name, int lvl) {
        super(name, lvl);
        this.setStats(HP, ATTACK, DEFENSE, SP_ATK, SP_DEF, SPEED);
        TYPES.forEach(this::addType);
        MOVES.forEach(this::addMove);
    }

    public Torchic(int lvl) {
        this(NAME, lvl);
    }

    public Torchic() {
        this(NAME, 1);
    }
}
