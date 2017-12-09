package com.structural.proxy;

import java.util.Scanner;

public class InputHelper {
    public Boolean isServerChosenByUser() {
        System.out.println("Choose:");
        System.out.println("1. Server");
        System.out.println("2. Client");
        Integer userInput = Integer.parseInt(new Scanner(System.in).nextLine());

        switch (userInput) {
            case 1:
                return true;
            case 2:
                return false;
            default:
                System.out.println("ERROR on choice");
                return null;
        }
    }
}
