package ru.erius.lab2.move.status;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {

    private final static String NAME = "Swagger";
    private final static String MESSAGE = "использует " + NAME;
    private final static Type TYPE = Type.NORMAL;
    private final static double POWER = 0.0D, ACCURACY = 85.0D;

    public Swagger() {
        super(TYPE, POWER, ACCURACY);
    }

    @Override
    protected String describe() {
        return MESSAGE;
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.ATTACK, 1);
        Effect.confuse(pokemon);
    }
}
