package com.decorator.ingredients;

import com.decorator.Burger;
import com.decorator.BurgerDecorator;

import java.util.List;

public class Cheese extends BurgerDecorator {

    public Cheese(Burger burger) {
        super(burger);
        burger.getIngredients().add("Cheese");
    }

    @Override
    public List<String> getIngredients() {
        return burger.getIngredients();
    }

    @Override
    public double getCost() {
        return burger.getCost()+0.4;
    }
}
