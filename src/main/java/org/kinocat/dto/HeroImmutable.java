package org.kinocat.dto;

import java.util.Objects;

public class HeroImmutable {
    final private String name;
    final private int strength;
    final private int dexterity;
    final private int luck;

    final private long experience;

    public HeroImmutable(String name, int strength, int dexterity, int luck, long experience) {
        this.name = name;
        this.strength = strength;
        this.dexterity = dexterity;
        this.luck = luck;
        this.experience = experience;
    }


    public String getName() {
        return name;
    }


    public int getStrength() {
        return strength;
    }


    public int getDexterity() {
        return dexterity;
    }


    public int getLuck() {
        return luck;
    }

    public long getExperience() {
        return experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HeroImmutable that = (HeroImmutable) o;
        return strength == that.strength && dexterity == that.dexterity && luck == that.luck && experience == that.experience && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, strength, dexterity, luck, experience);
    }
}
