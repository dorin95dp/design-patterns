package com.dorin.patterns.creational.factorymethod;

public class CurrencyFactory {

    //use getCurrency method to get object of type Currency
    public Currency getCurrency(String planType){
        switch (planType) {
            case "EURO": return new Euro();
            case "DOLLAR": return new Dollar();
            case "RON": return new Ron();
            default: return null;
        }
    }
}
