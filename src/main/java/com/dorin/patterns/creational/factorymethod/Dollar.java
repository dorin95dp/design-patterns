package com.dorin.patterns.creational.factorymethod;

public class Dollar extends Currency {
    @Override
    public void getRate() {
        rate = 17.50;
    }
}
