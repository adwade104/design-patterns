package com.wade.adam.patterns.behavioral.interpreter.wiki;

import java.util.Map;

public class MinusExpression implements Expression {

    private Expression firstExpression;
    private Expression secondExpression;

    public MinusExpression(Expression firstExpression, Expression secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpret(Map<String, Integer> context) {
        return firstExpression.interpret(context) - secondExpression.interpret(context);
    }

}
