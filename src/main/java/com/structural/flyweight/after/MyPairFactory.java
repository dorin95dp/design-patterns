package com.structural.flyweight.after;

public class MyPairFactory {
    private MyPair[] myPairsPool;

    public MyPairFactory(int maxRows) {
        myPairsPool = new MyPair[maxRows];
    }

    public MyPair getMyPair(int row) { // the flyweight
        if (myPairsPool[row] == null) {
            myPairsPool[row] = new MyPair(row);
        }

        return myPairsPool[row];
    }
}
