package com.structural.bridge;

public class SimpleCooker extends Cooker {
    public SimpleCooker(String name, CookingAction cookingAction) {
        super(name, cookingAction);
    }

    public void cook() {
        super.cook();
    }

}
