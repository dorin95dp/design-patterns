package com.structural.flyweight.after;

class MyPair { // doesn't hold the col in itself.
    private int row;

    public MyPair(int row) {
        this.row = row;
        System.out.print("row: " + this.row + " -");
    }

    void print(int col) {
        System.out.print(" " + row + col);
    }
}
