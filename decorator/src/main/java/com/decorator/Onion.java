package com.decorator;

import java.util.Arrays;
import java.util.List;


public class Onion extends BurgerDecorator{

    public Onion(Burger burger) {
        super(burger);
        burger.getIngredients().add("Onions");
    }

    @Override
    public List<String> getIngredients() {
        return burger.getIngredients();
    }

    @Override
    public double getCost() {
        return burger.getCost()+0.3;
    }


}
