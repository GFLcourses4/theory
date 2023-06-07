package com.seroja.main.proxy;

import com.seroja.main.entities.HeavyMeal;
import com.seroja.main.entities.HeavyMealImpl;

public class HeavyMealProxy implements HeavyMeal {
    private static HeavyMealImpl heavyMeal;
    @Override
    public void cookHeavyMeal() {
        if (heavyMeal == null){
            heavyMeal = new HeavyMealImpl();
        }
        heavyMeal.cookHeavyMeal();
    }
}
