package com.dorin.patterns.creational.factorymethod;

public class Euro extends Currency {
    @Override
    public void getRate() {
        rate = 20.50;
    }
}
