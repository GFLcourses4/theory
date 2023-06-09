package com.seroja.main.decorator;

public class VeganDinner extends DinerDecorator{

    public VeganDinner(Dinner dinner){
        super(dinner);
    }

    public String cook(){
        return super.cook() + veganCook();
    }

    private String veganCook() {
        return "Cooking vegan dinner";
    }

}
