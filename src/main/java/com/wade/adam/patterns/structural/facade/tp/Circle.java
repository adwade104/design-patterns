package com.wade.adam.patterns.structural.facade.tp;

import com.wade.adam.patterns.creational.factory.tp.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }

}
