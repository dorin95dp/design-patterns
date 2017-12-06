package com.structural.bridge.cookingActions;

import com.structural.bridge.CookingAction;

public class CookCake implements CookingAction {
    @Override
    public void cook(String cookerName) {
        System.out.println("Cake by cooker" + cookerName);
    }
}
