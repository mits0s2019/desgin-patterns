package com.decorator;

import com.decorator.ingredients.Bacon;
import com.decorator.ingredients.Cheese;
import com.decorator.ingredients.Onion;

public class BurgerShop {

    public static void main(String[] args) {

        Burger burger=new Cheese(new Onion(new Bacon(new PlainBurger())));

        System.out.println("ingredients : "+burger.getIngredients());
        System.out.println("total cost : "+burger.getCost());
    }
}

