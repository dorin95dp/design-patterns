package com.structural.bridge;

import com.structural.bridge.cookingActions.CookCake;
import com.structural.bridge.cookingActions.CookPizza;

public class BridgeDemo {
    public static void main(String[] args) {
        Cooker cooker1 = new SimpleCooker("Oleg", new CookCake());
        Cooker cooker2 = new SimpleCooker("Jora", new CookPizza());

        cooker1.cookingAction = new CookPizza();
        
        cooker1.cook();
        cooker2.cook();
    }
}
