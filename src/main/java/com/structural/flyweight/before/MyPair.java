package com.structural.flyweight.before;

class MyPair {
    private int row, col;
    private static int num = 0;

    public MyPair(int maxColPerRow) {
        row = num / maxColPerRow;
        col = num % maxColPerRow;
        num++;
    }

    public void print() {
        System.out.print(" " + row + col);
    }


    
}