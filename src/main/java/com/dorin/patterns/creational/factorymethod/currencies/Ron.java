package com.dorin.patterns.creational.factorymethod.currencies;

public class Ron extends Currency {
    @Override
    public void getRate() {
        rate = 4.50;
    }
}
