package com.wade.adam.pattern.decorator.wiki;

public abstract class WindowDecorator implements Window {

    protected Window window;

    public WindowDecorator(Window window) {
        this.window = window;
    }

    @Override
    public void draw() {
        window.draw();
    }

    @Override
    public String getDescription() {
        return window.getDescription();
    }

}
