package com.dorin.patterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal veganMeal = mealBuilder.prepareVeganMeal();
        System.out.println("Vegan Meal");
        veganMeal.showItems();
        System.out.println("Total Cost: " + veganMeal.getCost());

        Meal normalMeal = mealBuilder.prepareNormalMeal();
        System.out.println("\n\nNormal Meal");
        normalMeal.showItems();
        System.out.println("Total Cost: " + normalMeal.getCost());
    }
}
