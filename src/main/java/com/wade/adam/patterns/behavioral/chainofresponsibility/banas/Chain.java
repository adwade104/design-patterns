package com.wade.adam.patterns.behavioral.chainofresponsibility.banas;

public interface Chain {

    void setNextInChain(Chain nextInChain);
    void calculate(Numbers request);

}
