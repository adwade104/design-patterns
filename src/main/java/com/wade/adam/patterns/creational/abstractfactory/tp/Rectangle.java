package com.wade.adam.patterns.creational.abstractfactory.tp;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
