package com.wade.adam.pattern.interpreter.wiki;

import java.util.Map;

public class NumberExpression implements Expression{

    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    public NumberExpression(String number) {
        this.number = Integer.parseInt(number);
    }

    @Override
    public int interpret(Map<String, Integer> context) {
        return number;
    }
}
