package com.behavioral.strategy;

import java.util.Scanner;

public class StrategyDemo {
    public static void main(String[] args) {
        InputTreater treater = new InputTreater();
        boolean isStopped = false;

        while (!isStopped) {
            try {
                System.out.println("\nPlease choose operation: (Add, Subtract, Multiply)");
                String userChoice = new Scanner(System.in).nextLine();

                Strategy operation = treater.getOperation(userChoice);
                Context context = new Context(operation);

                System.out.println("Introduce first number:");
                Integer first = Integer.parseInt(new Scanner(System.in).nextLine());

                System.out.println("Introduce second number:");
                Integer second = Integer.parseInt(new Scanner(System.in).nextLine());

                Integer result = context.executeStrategy(first, second);
                System.out.println("\nResult: " + result);
                isStopped = true;
            } catch (NullPointerException npe) {
                System.out.println("No such operation");
            } catch (NumberFormatException nfe) {
                System.out.println("Please introduce a integer number");
            }
        }

    }
}
