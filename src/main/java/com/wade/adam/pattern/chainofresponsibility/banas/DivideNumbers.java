package com.wade.adam.pattern.chainofresponsibility.banas;

public class DivideNumbers implements Chain {

    private Chain nextInChain;

    @Override
    public void setNextInChain(Chain nextInChain) {
        this.nextInChain = nextInChain;
    }

    @Override
    public void calculate(Numbers request) {

        if("div".equalsIgnoreCase(request.getCalculationWanted())){

            System.out.println(String.format("%s / %s = %s",
                    request.getNumber1(),request.getNumber2(), request.getNumber1() / request.getNumber2()));

        }
        else {

            System.out.println("Only works for add, sub, mult, and div");

        }

    }

}
