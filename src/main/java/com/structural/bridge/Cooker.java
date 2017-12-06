package com.structural.bridge;

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
}
