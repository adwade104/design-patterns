package com.wade.adam.pattern.factory.tp;

public class Driver {

    public static void main(String[] args){

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shapeOne = shapeFactory.getShape("Rectangle");
        shapeOne.draw();

        Shape shapeTwo = shapeFactory.getShape("Square");
        shapeTwo.draw();

        Shape shapeThree = shapeFactory.getShape("Circle");
        shapeThree.draw();

    }

}
