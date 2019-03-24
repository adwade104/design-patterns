package com.wade.adam.pattern.decorator.wiki;

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
