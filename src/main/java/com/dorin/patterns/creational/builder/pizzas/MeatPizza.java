package com.dorin.patterns.creational.builder.pizzas;

public class MeatPizza extends Pizza {

    @Override
    public double price() {
        return 77.0;
    }

    @Override
    public String name() {
        return "Peperoni";
    }
}
