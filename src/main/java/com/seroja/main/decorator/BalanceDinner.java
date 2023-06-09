package com.seroja.main.decorator;

public class BalanceDinner extends DinerDecorator {

    public BalanceDinner(Dinner dinner){
        super(dinner);
    }

    public String cook(){
        return super.cook() + balanceCook();
    }

    private String balanceCook() {
        return "Cooking balance dinner";
    }

}
