package com.behavioral.memento;

public class MementoDemo {
    public static void main(String[] args) {

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState(Feel.HAPPY);
        originator.setState(Feel.TIRED);
        careTaker.add(originator.saveStateToFeeling());

        originator.setState(Feel.SAD);
        careTaker.add(originator.saveStateToFeeling());

        originator.setState(Feel.RELAXED);
        System.out.println("Current State: " + originator.getState());

        originator.getStateFromFeeling(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromFeeling(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }
}
