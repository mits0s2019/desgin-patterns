package com.decorator;

import java.util.List;

abstract public class BurgerDecorator implements Burger {

    protected Burger burger;

    public BurgerDecorator(Burger burger) {
        this.burger = burger;
    }

    abstract public List<String> getIngredients();

    abstract public double getCost();
}
