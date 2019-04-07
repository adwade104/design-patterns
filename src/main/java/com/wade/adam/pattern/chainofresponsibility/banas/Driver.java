package com.wade.adam.pattern.chainofresponsibility.banas;

public class Driver {

    public static void main(String[] args){

        Chain chainCalc1 = new AddNumbers();
        Chain chainCalc2 = new SubtractNumbers();
        Chain chainCalc3 = new MultiplyNumbers();
        Chain chainCalc4 = new DivideNumbers();

        chainCalc1.setNextInChain(chainCalc2);
        chainCalc2.setNextInChain(chainCalc3);
        chainCalc3.setNextInChain(chainCalc4);

        Numbers request = new Numbers(4,2,"add");
        chainCalc1.calculate(request);

        Numbers request2 = new Numbers(4,2,"mult");
        chainCalc1.calculate(request2);

        Numbers request3 = new Numbers(4,2,"pow");
        chainCalc1.calculate(request3);

    }

}
