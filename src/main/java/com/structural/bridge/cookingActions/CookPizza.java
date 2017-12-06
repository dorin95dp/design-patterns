package com.structural.bridge.cookingActions;

import com.structural.bridge.CookingAction;

public class CookPizza implements CookingAction {
    @Override
    public void cook(String cookerName) {
        System.out.println("Pizza by cooker " + cookerName);
    }
}
