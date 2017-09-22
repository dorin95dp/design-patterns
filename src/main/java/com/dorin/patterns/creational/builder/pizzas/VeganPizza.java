package com.dorin.patterns.creational.builder.pizzas;

public class VeganPizza extends Pizza {

    @Override
    public double price() {
        return 45.0;
    }

    @Override
    public String name() {
        return "Vegan Pizza with broccoli";
    }
}
