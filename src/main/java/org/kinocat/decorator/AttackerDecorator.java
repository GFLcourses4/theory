package org.kinocat.decorator;

public abstract class AttackerDecorator implements Attacker {

    private final Attacker mAttacker;

    public AttackerDecorator(Attacker attacker) {
        mAttacker = attacker;
    }

    @Override
    public void attack() {
        mAttacker.attack();

    }

    @Override
    public int getDamage() {
        return mAttacker.getDamage();
    }
}
