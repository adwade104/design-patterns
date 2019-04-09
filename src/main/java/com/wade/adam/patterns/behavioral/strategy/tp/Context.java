package com.wade.adam.patterns.behavioral.strategy.tp;

public class Context {
    private Strategy strategy;

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
