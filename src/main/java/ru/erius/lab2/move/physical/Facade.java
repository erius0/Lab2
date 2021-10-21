package ru.erius.lab2.move.physical;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {

    private final static String NAME = "Facade";
    private final static String MESSAGE = "использует " + NAME;
    private final static Type TYPE = Type.NORMAL;
    private final static double POWER = 70.0D, ACCURACY = 100.0D;

    public Facade() {
        super(TYPE, POWER, ACCURACY);
    }

    @Override
    protected String describe() {
        return MESSAGE;
    }

    @Override
    protected double calcBaseDamage(Pokemon pokemon, Pokemon pokemon1) {
        Status status = pokemon.getCondition();
        boolean hasRequiredStatus = status == Status.BURN || status == Status.POISON || status == Status.PARALYZE;
        int multiplier = hasRequiredStatus ? 2 : 1;
        return super.calcBaseDamage(pokemon, pokemon1) * multiplier;
    }
}
