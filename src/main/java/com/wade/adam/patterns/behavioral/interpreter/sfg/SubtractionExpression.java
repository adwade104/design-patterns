package com.wade.adam.patterns.behavioral.interpreter.sfg;

public class SubtractionExpression implements Expression {

    private Expression firstExpression;
    private Expression secondExpression;

    public SubtractionExpression(Expression firstExpression, Expression secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpret() {
        return firstExpression.interpret() - secondExpression.interpret();
    }

    @Override
    public String toString() {
        return "-";
    }
}
