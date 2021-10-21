package ru.erius.lab2.move.special;

import ru.ifmo.se.pokemon.*;

public class AirSlash extends SpecialMove {

    private final static String NAME = "Air Slash";
    private final static String MESSAGE = "использует " + NAME;
    private final static Type TYPE = Type.FLYING;
    private final static double POWER = 75.0D, ACCURACY = 95.0D;

    public AirSlash() {
        super(TYPE, POWER, ACCURACY);
    }

    @Override
    protected String describe() {
        return MESSAGE;
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() < 0.3D) Effect.flinch(pokemon);
    }
}
