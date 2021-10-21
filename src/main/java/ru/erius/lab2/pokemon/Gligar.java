package ru.erius.lab2.pokemon;

import ru.erius.lab2.move.status.Confide;
import ru.erius.lab2.move.physical.Facade;
import ru.erius.lab2.move.status.Swagger;
import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

import java.util.Arrays;
import java.util.List;

public class Gligar extends Pokemon {

    protected final static String NAME = "Gligar";
    protected final static List<Type> TYPES = Arrays.asList(Type.GROUND, Type.FLYING);
    protected final static double
            HP = 65.0D, ATTACK = 75.0D, DEFENSE = 105.0D,
            SP_ATK = 35.0D, SP_DEF = 65.0D, SPEED = 85.0D;
    protected final static List<Move> MOVES =  Arrays.asList(new Swagger(), new Confide(), new Facade());

    public Gligar(String name, int lvl) {
        super(name, lvl);
        this.setStats(HP, ATTACK, DEFENSE, SP_ATK, SP_DEF, SPEED);
        TYPES.forEach(this::addType);
        MOVES.forEach(this::addMove);
    }

    public Gligar(int lvl) {
        this(NAME, lvl);
    }

    public Gligar() {
        this(NAME, 1);
    }
}
