package com.seroja.main.facade;

public class MealFacade {
    MealService mealService = new MealService();
    PotatoesMaker potatoesMaker = new PotatoesMaker();
    SaladMaker saladMaker = new SaladMaker();
    SteakMaker steakMaker = new SteakMaker();
    private void makeSalad(){
        saladMaker.washProducts();
        saladMaker.cutProducts();
        saladMaker.mixProducts();
        System.out.println("Salad ready!");
    }

    private void makeSteak(){
        steakMaker.cutMeat();
        steakMaker.marinateMeat();
        steakMaker.fryMeat();
        System.out.println("Steak ready!");
    }

    private void makePotatoes(){
        potatoesMaker.peelPotatoes();
        potatoesMaker.cutPotatoes();
        potatoesMaker.bakePotatoes();
        System.out.println("Potatoes ready!");
    }

    public void makeMeal(){
        makeSalad();
        makeSteak();
        makePotatoes();
        mealService.setTable();
        mealService.startEating();
        mealService.stopEating();
        mealService.cleanTable();
    }
}
