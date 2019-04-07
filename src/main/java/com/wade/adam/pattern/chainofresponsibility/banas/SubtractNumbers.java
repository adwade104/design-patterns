package com.wade.adam.pattern.chainofresponsibility.banas;

public class SubtractNumbers implements Chain {

    private Chain nextInChain;

    @Override
    public void setNextInChain(Chain nextInChain) {
        this.nextInChain = nextInChain;
    }

    @Override
    public void calculate(Numbers request) {

        if("sub".equalsIgnoreCase(request.getCalculationWanted())){

            System.out.println(String.format("%s - %s = %s",
                    request.getNumber1(),request.getNumber2(), request.getNumber1() - request.getNumber2()));

        }
        else {

            nextInChain.calculate(request);

        }

    }

}
