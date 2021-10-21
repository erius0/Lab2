package ru.erius.lab2.move.status;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class DoubleTeam extends StatusMove {

    private final static String NAME = "Double Team";
    private final static String MESSAGE = "использует " + NAME;
    private final static Type TYPE = Type.NORMAL;
    private final static double POWER = 0.0D, ACCURACY = 100.0D;

    public DoubleTeam() {
        super(TYPE, POWER, ACCURACY);
    }

    @Override
    protected String describe() {
        return MESSAGE;
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.EVASION, 1);
    }
}
