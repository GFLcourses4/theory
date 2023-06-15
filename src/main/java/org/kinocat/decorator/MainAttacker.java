package org.kinocat.decorator;

import java.util.Random;

public class MainAttacker implements Attacker {

    Random random = new Random();

    int damage;

    @Override
    public void attack() {
        damage = random.nextInt(10);
        System.out.println("The attacker made an attack");
    }

    @Override
    public int getDamage() {
        System.out.println("The attacker dealt " + damage);
        return damage;
    }
}
