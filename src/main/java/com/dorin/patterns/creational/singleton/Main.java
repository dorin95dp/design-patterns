package com.dorin.patterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        DatabaseParser databaseParser = DatabaseParser.getInstance();
        String data = databaseParser.getData();

        System.out.println(data);
    }
}
