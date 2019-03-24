package com.wade.adam.pattern.decorator.wiki;

public class HorizontalScrollbarDecorator extends WindowDecorator {

    public HorizontalScrollbarDecorator(Window window) {
        super(window);
    }

    @Override
    public void draw() {
        super.draw();
        drawHorizontalScrollbar();
    }

    private void drawHorizontalScrollbar(){
        //Draw a vertical scrollbar
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", including horizontal scrollbars";
    }

}
