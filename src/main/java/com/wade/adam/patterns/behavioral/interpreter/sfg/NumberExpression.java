package com.wade.adam.patterns.behavioral.interpreter.sfg;

public class NumberExpression implements Expression {

    private int number;

    public NumberExpression(int number){
        this.number = number;
    }

    public NumberExpression(String number){
        this.number = Integer.parseInt(number);
    }

    @Override
    public int interpret() {
        return this.number;
    }

}
