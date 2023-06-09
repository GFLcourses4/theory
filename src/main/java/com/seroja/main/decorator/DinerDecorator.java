package com.seroja.main.decorator;

public abstract class DinerDecorator implements Dinner {

    private Dinner dinner;

    public DinerDecorator(Dinner dinner) {
        this.dinner = dinner;
    }

    public DinerDecorator() {
    }

    @Override
    public String cook(){
        return dinner.cook();
    }

}
