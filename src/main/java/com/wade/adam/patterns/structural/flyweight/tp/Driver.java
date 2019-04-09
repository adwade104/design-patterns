package com.wade.adam.patterns.structural.flyweight.tp;

import java.awt.*;

public class Driver {

    private static final Color[] colors = {Color.red, Color.green, Color.blue, Color.white, Color.black};

    public static void main(String[] args) {

        //Remember flyweight decreases time ON AVERAGE

        System.out.println("Starting Default");
        long defaultTime = executeDefaultExample(100000);
        System.out.println(String.format("Default took %s ms", defaultTime));

        System.out.println("Starting Flyweight");
        long flyweightTime = executeFlyweightExample(100000);
        System.out.println(String.format("Flyweight took %s ms", flyweightTime));

    }

    private static long executeDefaultExample(long numCircles) {

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < numCircles; i++) {
            Circle circle = new Circle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }

        long endTime = System.currentTimeMillis();

        return (endTime - startTime);
    }

    private static long executeFlyweightExample(long numCircles) {

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < numCircles; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }

        long endTime = System.currentTimeMillis();

        return (endTime - startTime);

    }

    private static Color getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }

}
