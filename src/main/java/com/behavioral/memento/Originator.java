package com.behavioral.memento;

public class Originator {
    private Feel state;

    public void setState(Feel state) {
        this.state = state;
    }

    public Feel getState() {
        return state;
    }

    public Feeling saveStateToFeeling() {
        return new Feeling(state);
    }

    public void getStateFromFeeling(Feeling feeling) {
        state = feeling.getState();
    }
}
