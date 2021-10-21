package ru.erius.lab2.move.status;

import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {

    private final static String NAME = "Confide";
    private final static String MESSAGE = "использует " + NAME;
    private final static Type TYPE = Type.NORMAL;
    private final static double POWER = 0.0D, ACCURACY = 100.0D;

    public Confide() {
        super(TYPE, POWER, ACCURACY);
    }

    @Override
    protected String describe() {
        return MESSAGE;
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPECIAL_ATTACK, -1);
    }
}
