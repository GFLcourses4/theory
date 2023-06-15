package org.kinocat.decorator;

import java.util.Random;

public class ParalyzingAttackerDecorator extends AttackerDecorator{

    public ParalyzingAttackerDecorator(Attacker attacker) {
        super(attacker);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("The attacker tries to paralyze the enemy");
    }

    @Override
    public int getDamage() {
        int damage = super.getDamage();
        System.out.println("The enemy is" + (new Random().nextBoolean() ? "" : " not") + " paralyzed.");
        return damage;
    }
}
