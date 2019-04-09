package com.wade.adam.patterns.behavioral.chainofresponsibility.banas;

public class AddNumbers implements Chain {

    private Chain nextInChain;

    @Override
    public void setNextInChain(Chain nextInChain) {
        this.nextInChain = nextInChain;
    }

    @Override
    public void calculate(Numbers request) {

        if("add".equalsIgnoreCase(request.getCalculationWanted())){

            System.out.println(String.format("%s + %s = %s",
                    request.getNumber1(),request.getNumber2(), request.getNumber1() + request.getNumber2()));

        }
        else {

            nextInChain.calculate(request);

        }

    }

}
