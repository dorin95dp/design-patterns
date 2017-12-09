package com.behavioral.strategy;

import com.behavioral.strategy.operations.OperationAdd;
import com.behavioral.strategy.operations.OperationMultiply;
import com.behavioral.strategy.operations.OperationSubtract;

public class InputTreater {
    public Strategy getOperation(String userChoice) throws NullPointerException {
        switch (userChoice.trim().toLowerCase()) {
            case "add":
                return new OperationAdd();
            case "subtract":
                return new OperationSubtract();
            case "multiply":
                return new OperationMultiply();
            default:
                throw new NullPointerException();
        }
    }
}
