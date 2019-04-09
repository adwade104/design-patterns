package com.wade.adam.patterns.creational.builder.wiki;

public class CarBuilder {

    private int wheels = 0;
    private String color = "";

    public CarBuilder setWheels(int wheels) {
        this.wheels = wheels;
        return this;
    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public Car build(){
        return new Car(wheels, color);
    }
}
