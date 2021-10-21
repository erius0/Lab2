package ru.erius.lab2.move.physical;

import ru.ifmo.se.pokemon.*;

public class Bulldoze extends PhysicalMove {

    private final static String NAME = "Bulldoze";
    private final static String MESSAGE = "использует " + NAME;
    private final static Type TYPE = Type.GROUND;
    private final static double POWER = 60.0D, ACCURACY = 100.0D;

    public Bulldoze() {
        super(TYPE, POWER, ACCURACY);
    }

    @Override
    protected String describe() {
        return MESSAGE;
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPEED, -1);
    }
}
