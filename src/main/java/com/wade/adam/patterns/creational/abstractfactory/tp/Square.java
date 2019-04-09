package com.wade.adam.patterns.creational.abstractfactory.tp;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
