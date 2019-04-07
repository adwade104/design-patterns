package com.wade.adam.pattern.interpreter.sfg;

public class DivisionExpression implements Expression {

    private Expression firstExpression;
    private Expression secondExpression;

    public DivisionExpression(Expression firstExpression, Expression secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpret() {
        return firstExpression.interpret() / secondExpression.interpret();
    }

    @Override
    public String toString() {
        return "/";
    }
}
