package com.wade.adam.pattern.bridge.so;

public class Car extends Vehicle {

    public Car(Gear gear) {
        super(gear);
    }

    @Override
    public void addGear() {
        System.out.print("Car Handles ");
        gear.handleGear();
    }

}
