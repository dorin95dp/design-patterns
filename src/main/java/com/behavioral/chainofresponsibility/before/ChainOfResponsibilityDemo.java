package com.behavioral.chainofresponsibility.before;

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        Handler[] nodes = {
                new Handler(),
                new Handler(),
                new Handler(),
                new Handler()
        };

        for (int i = 1; i < 6; i++) {
            int j = 0;
            System.out.println("Operation #" + i + ":");
            while (!nodes[j].execute(i)) {
                j = (j + 1) % nodes.length;
            }
            System.out.println();
        }
    }
}