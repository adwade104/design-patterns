package com.wade.adam.patterns.behavioral.strategy.wiki;

public class Sedan extends Car {

    public Sedan() {
        super(new Brake());
    }

}
