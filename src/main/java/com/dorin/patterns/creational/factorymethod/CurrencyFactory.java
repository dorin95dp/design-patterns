package com.dorin.patterns.creational.factorymethod;

import com.dorin.patterns.creational.factorymethod.currencies.Currency;
import com.dorin.patterns.creational.factorymethod.currencies.Dollar;
import com.dorin.patterns.creational.factorymethod.currencies.Euro;
import com.dorin.patterns.creational.factorymethod.currencies.Ron;

public class CurrencyFactory {

    //use getCurrency method to get object of type Currency
    public Currency getCurrency(String currencyType){
        switch (currencyType.toUpperCase()) {
            case "EURO": return new Euro();
            case "DOLLAR": return new Dollar();
            case "RON": return new Ron();
            default: return null;
        }
    }
}
