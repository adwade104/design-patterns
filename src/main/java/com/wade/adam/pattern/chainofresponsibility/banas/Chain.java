package com.wade.adam.pattern.chainofresponsibility.banas;

public interface Chain {

    void setNextInChain(Chain nextInChain);
    void calculate(Numbers request);

}
