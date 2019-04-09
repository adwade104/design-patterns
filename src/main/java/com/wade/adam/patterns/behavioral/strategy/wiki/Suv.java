package com.wade.adam.patterns.behavioral.strategy.wiki;

public class Suv extends Car {

    public Suv() {
        super(new BrakeWithAbs());
    }

}
