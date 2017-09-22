package com.dorin.patterns.creational.abstractfactory.computers;

public class Lenovo implements Computer {

    @Override
    public void process() {
        System.out.println("Lenovo is processing");
    }
}
