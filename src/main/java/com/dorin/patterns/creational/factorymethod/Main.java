package com.dorin.patterns.creational.factorymethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static String currencyName;
    private static int units;

    public static void main(String[] args) throws IOException {

        getUserInfo();
        CurrencyFactory currencyFactory = new CurrencyFactory();

        if (currencyName != null && units != 0) {
            Currency currency = currencyFactory.getCurrency(currencyName);

            System.out.print("Value for " + currencyName + " of  " + units + " units is: ");
            currency.getRate();
            currency.calculateValue(units);
        } else {
            System.out.println("Problems in entering currencyName and number of units!");
        }
    }

    private static void getUserInfo() {
        System.out.println("Enter the name of currency: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            currencyName = br.readLine();
        } catch (IOException e) {
            System.out.println("IOException in entering currencyName");
        }

        System.out.println("Enter the number of units for value will be calculated: ");
        try {
            units = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            System.out.println("IOException in entering number of units");
        }

    }

}
