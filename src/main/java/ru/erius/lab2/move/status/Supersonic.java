package ru.erius.lab2.move.status;

import ru.ifmo.se.pokemon.*;

public class Supersonic extends StatusMove {

    private final static String NAME = "Supersonic";
    private final static String MESSAGE = "использует " + NAME;
    private final static Type TYPE = Type.NORMAL;
    private final static double POWER = 0.0D, ACCURACY = 55.0D;

    public Supersonic() {
        super(TYPE, POWER, ACCURACY);
    }

    @Override
    protected String describe() {
        return MESSAGE;
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect.confuse(pokemon);
    }
}
