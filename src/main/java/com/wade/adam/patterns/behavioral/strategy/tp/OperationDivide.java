package com.wade.adam.patterns.behavioral.strategy.tp;

public class OperationDivide implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 / num2;  //please note, integer division
    }

}
