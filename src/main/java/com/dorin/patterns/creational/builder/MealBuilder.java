package com.dorin.patterns.creational.builder;

import com.dorin.patterns.creational.builder.drinks.Beer;
import com.dorin.patterns.creational.builder.drinks.IceTea;
import com.dorin.patterns.creational.builder.pizzas.MeatPizza;
import com.dorin.patterns.creational.builder.pizzas.VeganPizza;

public class MealBuilder {

    public Meal prepareVeganMeal (){
        Meal meal = new Meal();
        meal.addItem(new VeganPizza());
        meal.addItem(new IceTea());

        return meal;
    }

    public Meal prepareNormalMeal (){
        Meal meal = new Meal();
        meal.addItem(new MeatPizza());
        meal.addItem(new Beer());

        return meal;
    }
}

