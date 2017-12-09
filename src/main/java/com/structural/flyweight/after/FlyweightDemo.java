package com.structural.flyweight.after;

public class FlyweightDemo {
    public static final int NR_OF_ROWS = 6, NR_OF_COLS = 10;

    public static void main(String[] args) {
        MyPairFactory myPairFactory = new MyPairFactory(NR_OF_ROWS);

        for (int row = 0; row < NR_OF_ROWS; row++) {
            for (int col = 0; col < NR_OF_COLS; col++) {
                MyPair myPair = myPairFactory.getMyPair(row);

                myPair.print(col);
            }

            System.out.println();
        }
    }
}
