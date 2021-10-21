package ru.erius.lab2.move.status;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {

    private final static String NAME = "Rest";
    private final static String MESSAGE = "использует " + NAME;
    private final static Type TYPE = Type.PSYCHIC;
    private final static double POWER = 0.0D, ACCURACY = 100.0D;

    private final static Effect SLEEP = new Effect().condition(Status.SLEEP).turns(2);

    public Rest() {
        super(TYPE, POWER, ACCURACY);
    }

    @Override
    protected String describe() {
        return MESSAGE;
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        double maxHP = pokemon.getStat(Stat.HP);
        double heal = maxHP - pokemon.getHP();
        pokemon.setMod(Stat.HP, (int) -heal);
        pokemon.addEffect(SLEEP);
    }
}
