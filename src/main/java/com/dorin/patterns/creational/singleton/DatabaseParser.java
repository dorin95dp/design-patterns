package com.dorin.patterns.creational.singleton;

public class DatabaseParser {

    private static DatabaseParser INSTANCE = new DatabaseParser();
    private static String data;
    /* A private Constructor prevents any other
     * class from instantiating.
     */
    private DatabaseParser() {
        data = loadDataFromDB();
    }

    private String loadDataFromDB() {
        System.out.println("Does the action of data loading from DB!");
        return "data from DB";
    }

    public static DatabaseParser getInstance() {
        return INSTANCE;
    }

    public static String getData() {
        return data;
    }
}
