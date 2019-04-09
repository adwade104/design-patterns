package com.wade.adam.patterns.creational.builder.wiki;

public class Car {

    private final int wheels;
    private final String color;

    public Car(int wheels, String color) {
        this.wheels = wheels;
        this.color = color;
    }

    public int getWheels() {
        return wheels;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + wheels +
                ", color='" + color + '\'' +
                '}';
    }
}
