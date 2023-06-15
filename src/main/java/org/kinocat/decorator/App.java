package org.kinocat.decorator;

public class App {
    public static void main(String[] args) {

        Attacker attacker = new PoisonedAttackerDecorator(new ParalyzingAttackerDecorator(new MainAttacker()));
        attacker.attack();
        attacker.getDamage();

        System.out.println("======");
        attacker = new ParalyzingAttackerDecorator(new MainAttacker());
        attacker.attack();
        attacker.getDamage();

    }
}
