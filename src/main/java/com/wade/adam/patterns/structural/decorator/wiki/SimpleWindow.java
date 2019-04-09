package com.wade.adam.patterns.structural.decorator.wiki;

public class SimpleWindow implements Window {

    @Override
    public void draw() {
        //Draw a window
    }

    @Override
    public String getDescription() {
        return "Simple Window";
    }
}
