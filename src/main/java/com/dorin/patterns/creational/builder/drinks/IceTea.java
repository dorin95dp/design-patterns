package com.dorin.patterns.creational.builder.drinks;

public class IceTea extends ColdDrink {

    @Override
    public double price() {
        return 30.0;
    }

    @Override
    public String name() {
        return "IceTea";
    }
}
