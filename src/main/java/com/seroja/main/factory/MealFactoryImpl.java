package com.seroja.main.factory;

import com.seroja.main.entities.Meal;

public class MealFactoryImpl implements MealFactory {
    @Override
    public Meal createMeal() {
        return new Meal();
    }
}
