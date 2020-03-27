package com.iterator;

import java.util.Arrays;
import java.util.Iterator;


public class DesertRecipe implements RecipeIterator {

    String[] ingredients;
    String description;

    public DesertRecipe() {
        ingredients=new String[]{"desert1","desert2","desert3","desert4"};
        description="this is a desert description";
    }
    @Override
    public Iterator createIterator() {
        return Arrays.asList(ingredients).iterator();
    }

    public String getDescription() {
        return description;
    }
}
