package com.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Feeling> feelingList = new ArrayList<>();

    public void add(Feeling state) {
        feelingList.add(state);
    }

    public Feeling get(int index) {
        return feelingList.get(index);
    }
}