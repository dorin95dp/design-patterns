package com.dorin.patterns.creational.builder.drinks;

public class Beer extends ColdDrink {

    @Override
    public double price() {
        return 35.0;
    }

    @Override
    public String name() {
        return "Beer";
    }
}
