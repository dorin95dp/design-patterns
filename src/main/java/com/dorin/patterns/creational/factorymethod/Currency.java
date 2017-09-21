package com.dorin.patterns.creational.factorymethod;

abstract class Currency {
    protected double rate;

    abstract void getRate();

    public void calculateValue(int units) {
        System.out.println(units * rate);
    }
}
