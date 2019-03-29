package com.wade.adam.pattern.facade.tp;

import com.wade.adam.pattern.factory.tp.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
