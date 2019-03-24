package com.wade.adam.pattern.strategy.wiki;

public class Suv extends Car {

    public Suv() {
        super(new BrakeWithAbs());
    }

}
