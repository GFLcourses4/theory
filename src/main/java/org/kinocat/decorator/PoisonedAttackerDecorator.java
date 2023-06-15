package org.kinocat.decorator;

public class PoisonedAttackerDecorator extends AttackerDecorator{
    private static final int POISON_DAMAGE = 5;

    public PoisonedAttackerDecorator(Attacker attacker) {
        super(attacker);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("The Attacker also use poison");
    }

    @Override
    public int getDamage() {
        int damage = super.getDamage();
        System.out.println("Poison damage: " + POISON_DAMAGE);
        System.out.println("Overall damage: " + (5 + damage));
        return damage;
    }
}
