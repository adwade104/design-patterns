package com.wade.adam.pattern.bridge.so;

public class Truck extends Vehicle {

    public Truck(Gear gear) {
        super(gear);
    }

    @Override
    public void addGear() {
        System.out.print("Truck Handles ");
        gear.handleGear();
    }
}
