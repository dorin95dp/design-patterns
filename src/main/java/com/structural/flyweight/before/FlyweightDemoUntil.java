package com.structural.flyweight.before;

public class FlyweightDemoUntil {
    public static final int ROWS = 6, COLS = 10;

    public static void main( String[] args ) {
        MyPair[][] pairs = new MyPair[ROWS][COLS];
        for (int i=0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                pairs[i][j] = new MyPair(COLS);
            }
        }
        for (int i=0; i < ROWS; i++) {
            for (int j=0; j < COLS; j++) {
                pairs[i][j].print();
            }
            System.out.println();
        }
    }
}
