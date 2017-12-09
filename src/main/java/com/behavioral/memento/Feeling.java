package com.behavioral.memento;

public class Feeling { // memento
    private Feel feeling;

    public Feeling(Feel feeling) {
        this.feeling = feeling;
    }

    public Feel getState() {
        return feeling;
    }
}