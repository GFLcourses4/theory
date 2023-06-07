package com.seroja.main.builder;

import com.seroja.main.entities.Meal;

public class MealBuilderImpl implements MealBuilder {
    private String coldAppetizer;
    private String hotAppetizer;
    private String firstCourse;
    private String mainCourse;
    private String dessert;
    private String drink;

    @Override
    public void setColdAppetizer(String coldAppetizer) {
        this.coldAppetizer = coldAppetizer;
    }

    @Override
    public void setHotAppetizer(String hotAppetizer) {
        this.hotAppetizer = hotAppetizer;
    }

    @Override
    public void setFirstCourse(String firstCourse) {
        this.firstCourse = firstCourse;
    }

    @Override
    public void setMainCourse(String mainCourse) {
        this.mainCourse = mainCourse;
    }

    @Override
    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    @Override
    public void setDrink(String drink) {
        this.drink = drink;
    }

    public Meal build() {
        return new Meal(coldAppetizer, hotAppetizer, firstCourse, mainCourse, dessert, drink);
    }
}
