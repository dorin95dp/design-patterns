package com.dorin.patterns.creational.abstractfactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        switch (choice.toUpperCase()) {
            case "MONITOR": return new MonitorFactory();
            case "COMPUTER": return new ComputerFactory();
            default: return null;
        }
    }
}
