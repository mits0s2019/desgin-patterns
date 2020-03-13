package com.decorator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlainBurger implements Burger{

    private List<String> ingredients=new ArrayList(Arrays.asList("Bread","Ground Meat"));
    private double cost=5;

    public PlainBurger() {
    }

    public List<String> getIngredients() {
       return this.ingredients;
    }

    public double getCost() {
        return cost;
    }
}
