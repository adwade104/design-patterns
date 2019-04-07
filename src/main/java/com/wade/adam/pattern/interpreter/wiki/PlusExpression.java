package com.wade.adam.pattern.interpreter.wiki;

import java.util.Map;

public class PlusExpression implements Expression {

    private Expression firstExpression;
    private Expression secondExpression;

    public PlusExpression(Expression firstExpression, Expression secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpret(Map<String, Integer> context) {
        return firstExpression.interpret(context) + secondExpression.interpret(context);
    }
}
