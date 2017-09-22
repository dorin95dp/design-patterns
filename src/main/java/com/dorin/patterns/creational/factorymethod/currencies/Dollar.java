package com.dorin.patterns.creational.factorymethod.currencies;

public class Dollar extends Currency {
    @Override
    public void getRate() {
        rate = 17.50;
    }
}
