package com.wade.adam.pattern.bridge.so;

public class Driver {

    public static void main(String[] args){

        Gear gear = new ManualGear();
        Vehicle vehicle = new Car(gear);
        vehicle.addGear();

        gear = new AutoGear();
        vehicle = new Car(gear);
        vehicle.addGear();

        gear = new ManualGear();
        vehicle = new Truck(gear);
        vehicle.addGear();

        gear = new AutoGear();
        vehicle = new Truck(gear);
        vehicle.addGear();

    }

}
