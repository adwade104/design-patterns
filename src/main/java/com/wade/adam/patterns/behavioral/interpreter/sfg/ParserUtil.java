package com.wade.adam.patterns.behavioral.interpreter.sfg;

public class ParserUtil {

    public static boolean isOperator(String symbol){
        return (symbol.equals("+") || symbol.equals("-") || symbol.equals("*") || symbol.equals("/"));
    }

    public static Expression getExpression(Expression firstExpression, Expression secondExpression, String symbol) {

        switch (symbol) {
            case "+":
                return new AdditionExpression(firstExpression, secondExpression);
            case "-":
                return new SubtractionExpression(firstExpression, secondExpression);
            case "*":
                return new MultiplicationExpression(firstExpression, secondExpression);
            case "/":
                return new DivisionExpression(firstExpression, secondExpression);
            default:
                throw new RuntimeException("No Expression Found!");
        }

    }

}
