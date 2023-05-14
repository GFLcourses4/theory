package org.kinocat.dto;

import org.junit.Assert;
import org.junit.Test;

public class HeroImmutableTest {

    @Test
    public void testConstructorAndGetters() {
        HeroImmutable heroImmutable = new HeroImmutable("Siegfried", 25, 20, 10, 1000);
        Assert.assertNotNull(heroImmutable);
        Assert.assertEquals("Siegfried", heroImmutable.getName());
        Assert.assertEquals(25, heroImmutable.getStrength());
        Assert.assertEquals(20, heroImmutable.getDexterity());
        Assert.assertEquals(10, heroImmutable.getLuck());
        Assert.assertEquals(1000, heroImmutable.getExperience());
    }


    @Test
    public void testEqualityAndNotEquality() {
        HeroImmutable hero = new HeroImmutable("Siegfried", 25, 20, 10, 1000);
        Assert.assertSame(hero, hero);
        HeroImmutable hero2 = new HeroImmutable("Siegfried", 25, 20, 10, 1000);
        Assert.assertNotSame(hero, hero2);
    }

    @Test
    public void testEqualsAndHashCode() {
        HeroImmutable expectedHero = new HeroImmutable("Siegfried", 25, 20, 10, 1000);
        HeroImmutable actualHero = new HeroImmutable("Siegfried", 25, 20, 10, 1000);

        Assert.assertEquals(expectedHero, actualHero);
        Assert.assertEquals(expectedHero.hashCode(), actualHero.hashCode());
    }

}