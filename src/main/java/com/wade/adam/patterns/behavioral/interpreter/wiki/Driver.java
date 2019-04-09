package com.wade.adam.patterns.behavioral.interpreter.wiki;


import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

public class Driver {

    public static void main(final String[] args) {
        Expression expr = parse("w x z - +");
        Map<String, Integer> context = new HashMap<>();
        context.put("w", 5);
        context.put("x", 10);
        context.put("z", 42);
        int result = expr.interpret(context);
        System.out.println(result);
    }

    private static Expression parseToken(String token, ArrayDeque<Expression> stack) {
        Expression left, right;
        switch(token) {
            case "+":
                right = stack.pop();
                left = stack.pop();
                return new PlusExpression(left, right);
            case "-":
                right = stack.pop();
                left = stack.pop();
                return new MinusExpression(left, right);
            default:
                return new VariableExpression(token);
        }
    }
    public static Expression parse(String expression) {
        ArrayDeque<Expression> stack = new ArrayDeque<>();
        for (String token : expression.split(" ")) {
            stack.push(parseToken(token, stack));
        }
        return stack.pop();
    }
}
