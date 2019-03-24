package com.wade.adam.pattern.abstractfactory.tp;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
