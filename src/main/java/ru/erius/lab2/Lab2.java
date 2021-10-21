package ru.erius.lab2;

import ru.erius.lab2.pokemon.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

import java.util.Arrays;
import java.util.List;

public class Lab2 {

    public static void main(String[] args) {
        List<Pokemon> allies = Arrays.asList(
                new Comfey("Лёха", 1),
                new Gligar("Олег", 1),
                new Gliscor("Акакий", 1)
        );
        List<Pokemon> foes = Arrays.asList(
                new Torchic("Гоша", 1),
                new Combusken("Николай", 1),
                new Blaziken("Владимир", 1)
        );
        Battle battle = new Battle();
        allies.forEach(battle::addAlly);
        foes.forEach(battle::addFoe);
        battle.go();
    }

    private static int randLvl() {
        return (int) (Math.random() * 99.0D + 1.0D);
    }
}
