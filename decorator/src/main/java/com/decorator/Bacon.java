package com.decorator;

import java.util.List;



public class Bacon extends BurgerDecorator {

    public Bacon(Burger burger) {
        super(burger);
        burger.getIngredients().add("Bacon");
    }

    public List<String> getIngredients() {
        return burger.getIngredients();
    }

    public double getCost() {
        return burger.getCost()+0.5;
    }
}
