package ru.erius.lab2.move.status;

import ru.ifmo.se.pokemon.*;

public class AquaRing extends StatusMove {

    private final static String NAME = "Aqua Ring";
    private final static String MESSAGE = "использует " + NAME;
    private final static Type TYPE = Type.WATER;
    private final static double POWER = 0.0D, ACCURACY = 100.0D;

    public AquaRing() {
        super(TYPE, POWER, ACCURACY);
    }

    @Override
    protected String describe() {
        return MESSAGE;
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        double maxHP = pokemon.getStat(Stat.HP);
        Effect waterVeil = new Effect().stat(Stat.HP, (int) -(maxHP/  16)).turns(-1);
        pokemon.addEffect(waterVeil);
    }
}
