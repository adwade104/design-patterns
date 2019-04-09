package com.wade.adam.patterns.structural.flyweight.banas;

import java.awt.*;

public class MyRectFlyweight {

    private Color color;
    private int x;
    private int y;
    private int x2;
    private int y2;

    public MyRectFlyweight(Color color) { //Color is the intrinsic property
        this.color = color;
    }

    public void draw(Graphics g, int x, int y, int x2, int y2){

        g.setColor(color);
        g.fillRect(x, y, x2, y2);

    }

}
