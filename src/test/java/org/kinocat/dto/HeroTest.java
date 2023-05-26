package org.kinocat.dto;

import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest {

    private final String name = "Boromir";
    private final int strength = 30;

    @Test
    public void testEquality() {
        Hero expectedHero = new Hero(name, strength, 20, 10, 1000);
        Hero actualHero = new Hero(name, strength, 20, 10, 1000);

        assertEquals(expectedHero, actualHero);
    }

    @Test
    public void testNotEquality() {
        Hero expectedHero = new Hero(name, strength, 20, 10, 1000);
        Hero actualHero = new Hero(name, strength, 20, 15, 1000);
        assertNotEquals(expectedHero, actualHero);

    }

    @Test
    public void testConstructorsAndGetters() {
        Hero hero = new Hero("Boromir", 30, 20, 10, 1000);
        assertEquals(name, hero.getName());
        assertEquals(strength, hero.getStrength());
    }

    @Test
    public void testEqualsWithSameObject() {
        Hero hero = new Hero("Boromir", 30, 20, 10, 1000);
        assertEquals(hero, hero);
    }

    @Test
    public void testEmptyConstructor() {
        Hero hero = new Hero();
        assertNull(hero.getName());
        assertEquals(hero.getExperience(), 0);
    }

    @Test
    public void testSetterWithNull() {
        Hero hero = new Hero("Boromir", 30, 20, 10, 1000);
        hero.setName(null);
        assertNull(hero.getName());
    }

    @Test
    public void testSetters() {
        Hero hero = new Hero();
        hero.setName(name);
        hero.setStrength(strength);
        assertEquals(name, hero.getName());
        assertEquals(strength, hero.getStrength());
    }

}