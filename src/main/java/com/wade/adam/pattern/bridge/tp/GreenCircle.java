package com.wade.adam.pattern.bridge.tp;

public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("Drawing Circle[ color: green, x: " + x + ", y: " + y + ", radius: " + radius +  " ]");
    }
}
