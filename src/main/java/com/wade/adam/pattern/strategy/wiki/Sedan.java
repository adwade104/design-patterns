package com.wade.adam.pattern.strategy.wiki;

public class Sedan extends Car {

    public Sedan() {
        super(new Brake());
    }

}
