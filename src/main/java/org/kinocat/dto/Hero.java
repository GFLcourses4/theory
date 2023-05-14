package org.kinocat.dto;

import java.util.Objects;

public class Hero {
    private String name;
    private int strength;
    private int dexterity;
    private int luck;

    private long experience;

    public Hero() {

    }

    public Hero(String name, int strength, int dexterity, int luck, long experience) {
        this.name = name;
        this.strength = strength;
        this.dexterity = dexterity;
        this.luck = luck;
        this.experience = experience;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public long getExperience() {
        return experience;
    }

    public void setExperience(long experience) {
        this.experience = experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hero hero = (Hero) o;
        return strength == hero.strength && dexterity == hero.dexterity && luck == hero.luck && experience == hero.experience && Objects.equals(name, hero.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, strength, dexterity, luck, experience);
    }
}
