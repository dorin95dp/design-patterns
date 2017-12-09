package com.structural.bridge.cookingActions;

public class CookPizza implements CookingAction {
    @Override
    public void cook(String cookerName) {
        System.out.println("Pizza by cooker " + cookerName);
    }
}
