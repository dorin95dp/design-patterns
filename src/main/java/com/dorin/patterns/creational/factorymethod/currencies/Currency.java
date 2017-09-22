package com.dorin.patterns.creational.factorymethod.currencies;

public abstract class Currency {
    protected double rate;

    public abstract void getRate();

    public void calculateValue(int units) {
        System.out.println(units * rate);
    }
}
