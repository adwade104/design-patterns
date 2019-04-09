package com.wade.adam.patterns.structural.bridge.so;

public abstract class Vehicle {

    protected Gear gear;

    public Vehicle(Gear gear) {
        this.gear = gear;
    }

    public abstract void addGear();
}
