package com.wade.adam.patterns.structural.facade.tp;

import com.wade.adam.patterns.creational.factory.tp.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
