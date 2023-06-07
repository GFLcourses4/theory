package com.seroja.main.builder;

public class MealDirector {

    public void buildBreakfast(MealBuilder builder) {
        builder.setColdAppetizer("Fruit salad with yogurt and honey");
        builder.setHotAppetizer("Avocado toast");
        builder.setFirstCourse("Vegetable omelette");
        builder.setMainCourse("Fried bacon and eggs");
        builder.setDessert("Banana pancakes");
        builder.setDrink("Freshly squeezed orange juice");
    }

    public void buildLunch(MealBuilder builder) {
        builder.setColdAppetizer("Greek salad");
        builder.setHotAppetizer("Grilled calamari");
        builder.setFirstCourse("Tomato soup");
        builder.setMainCourse("Grilled fish with vegetables");
        builder.setDessert("Chocolate pudding");
        builder.setDrink("Lemonade");
    }

    public void buildDinner(MealBuilder builder) {
        builder.setColdAppetizer("Chilled scallops with sauce");
        builder.setHotAppetizer("Potato croquettes");
        builder.setFirstCourse("Cream of mushroom soup");
        builder.setMainCourse("Steak with mashed potatoes");
        builder.setDessert("Apple pie");
        builder.setDrink("Red wine");
    }

}
