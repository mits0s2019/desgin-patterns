package com.iterator;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FoodRecipe implements RecipeIterator {

    private List<String> ingredients;
    private String description;

    public FoodRecipe() {
        ingredients=new ArrayList<>(Arrays.asList("food1","food2","food3","food4"));
        description="this is a food description";
    }

    @Override
    public Iterator createIterator() {
        return ingredients.iterator();
    }

    public String getDescription() {
        return description;
    }
}
