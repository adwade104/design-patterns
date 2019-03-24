package com.wade.adam.pattern.decorator.tp;

public class Driver {

    public static void main(String[] args){

        System.out.println("Circle with normal border");
        Shape circle = new Circle();
        circle.draw();

        System.out.println();

        System.out.println("Rectangle with normal border");
        Shape rectangle = new Rectangle();
        rectangle.draw();

        System.out.println();
        System.out.println();

        System.out.println("Circle with red border");
        Shape redCircle = new RedShapeDecorator(new Circle());
        redCircle.draw();

        System.out.println();

        System.out.println("Rectangle with red border");
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        redRectangle.draw();

    }

}
