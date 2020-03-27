package com.iterator;

import java.util.Iterator;

public class App {

    public static void main(String[] args) {

        FoodRecipe foodRecipe=new FoodRecipe();
        DesertRecipe desertRecipe=new DesertRecipe();

        System.out.println("***** "+foodRecipe.getDescription()+"  *****");
        printIngredients(foodRecipe.createIterator());
        System.out.println("***** "+desertRecipe.getDescription()+"  *****");
        printIngredients(desertRecipe.createIterator());

    }

    public static void printIngredients(Iterator iterator){

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
