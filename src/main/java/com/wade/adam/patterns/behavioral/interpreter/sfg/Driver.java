package com.wade.adam.patterns.behavioral.interpreter.sfg;

public class Driver {

    public static void main(String[] args){

        String input = "2 1 5 + *";
        ExpressionParser expressionParser = new ExpressionParser();
        int result = expressionParser.parse(input);
        System.out.println("Final Result: " + result);

    }

}
