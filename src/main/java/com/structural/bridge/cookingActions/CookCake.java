package com.structural.bridge.cookingActions;

public class CookCake implements CookingAction {
    @Override
    public void cook(String cookerName) {
        System.out.println("Cake by cooker" + cookerName);
    }
}
