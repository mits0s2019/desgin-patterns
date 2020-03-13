package com.decorator.ingredients;

import com.decorator.Burger;
import com.decorator.BurgerDecorator;

import java.util.List;


public class Onion extends BurgerDecorator {

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
