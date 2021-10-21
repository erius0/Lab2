package ru.erius.lab2.pokemon;

import ru.erius.lab2.move.physical.Bulldoze;
import ru.erius.lab2.move.special.AirSlash;
import ru.erius.lab2.move.status.AquaRing;
import ru.erius.lab2.move.status.Swagger;
import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Comfey extends Pokemon {

    protected final static String NAME = "Comfey";
    protected final static List<Type> TYPES = Collections.singletonList(Type.FAIRY);
    protected final static double
            HP = 51.0D, ATTACK = 52.0D, DEFENSE = 90.0D,
            SP_ATK = 82.0D, SP_DEF = 110.0D, SPEED = 100.0D;
    protected final static List<Move> MOVES = Arrays.asList(new AirSlash(), new AquaRing(), new Swagger(), new Bulldoze());

    public Comfey(String name, int lvl) {
        super(name, lvl);
        this.setStats(HP, ATTACK, DEFENSE, SP_ATK, SP_DEF, SPEED);
        TYPES.forEach(this::addType);
        MOVES.forEach(this::addMove);
    }

    public Comfey(int lvl) {
        this(NAME, lvl);
    }

    public Comfey() {
        this(NAME, 1);
    }
}
