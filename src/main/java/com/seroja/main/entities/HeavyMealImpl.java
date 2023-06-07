package com.seroja.main.entities;

public class HeavyMealImpl implements HeavyMeal{

    public HeavyMealImpl(){
        heavyMealInit();
    }

    private void heavyMealInit() {
        System.out.println("Heavy meal initialization");
    }

    @Override
    public void cookHeavyMeal() {
        System.out.println("Heavy meal was cooked");
    }
}
