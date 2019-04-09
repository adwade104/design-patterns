package com.wade.adam.patterns.structural.decorator.wiki;

public class VerticalScrollbarDecorator extends WindowDecorator{

    public VerticalScrollbarDecorator(Window window) {
        super(window);
    }

    @Override
    public void draw() {
        super.draw();
        drawVerticalScrollbar();
    }

    private void drawVerticalScrollbar(){
        //Draw a vertical scrollbar
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", including vertical scrollbars";
    }

}
