package com.decorator;

public class BurgerShop {

    public static void main(String[] args) {

        Burger burger=new Onion(new Bacon(new PlainBurger()));
        System.out.println(burger.getIngredients());
        System.out.println(burger.getCost());
    }
}
