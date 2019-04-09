package com.wade.adam.patterns.behavioral.strategy.tp;

public class Driver {

    public static void main(String[] args){

        Context context = new Context();

        context.setStrategy(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context.setStrategy(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context.setStrategy(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));

        context.setStrategy(new OperationDivide());
        System.out.println("10 / 5 = " + context.executeStrategy(10, 5));
        
    }

}
