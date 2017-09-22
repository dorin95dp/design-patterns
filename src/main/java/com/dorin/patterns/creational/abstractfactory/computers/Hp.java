package com.dorin.patterns.creational.abstractfactory.computers;

public class Hp implements Computer {

    @Override
    public void process() {
        System.out.println("Hp is processing");
    }
}
