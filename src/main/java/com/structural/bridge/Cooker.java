package com.structural.bridge;

import com.structural.bridge.cookingActions.CookingAction;

public abstract class Cooker {
    private String name;
    protected CookingAction cookingAction;

    public Cooker(String name, CookingAction cookingAction) {
        this.name = name;
        this.cookingAction = cookingAction;
    }

    public void cook() {
        cookingAction.cook(name);
    }

    public void setCookingAction(CookingAction cookingAction) {
        this.cookingAction = cookingAction;
    }

    public CookingAction getCookingAction() {
        return cookingAction;
    }
}
