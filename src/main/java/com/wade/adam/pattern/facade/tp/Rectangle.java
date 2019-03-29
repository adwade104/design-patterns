package com.wade.adam.pattern.facade.tp;

import com.wade.adam.pattern.factory.tp.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
