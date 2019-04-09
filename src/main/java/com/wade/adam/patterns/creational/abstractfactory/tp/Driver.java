package com.wade.adam.patterns.creational.abstractfactory.tp;

public class Driver {

    public static void main(String[] args){

        AbstractFactory shapeFactory = FactoryProvider.getFactory(false);

        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();


        AbstractFactory roundedShapeFactory = FactoryProvider.getFactory(true);

        Shape roundedRectangle = roundedShapeFactory.getShape("RECTANGLE");
        roundedRectangle.draw();

        Shape roundedSquare = roundedShapeFactory.getShape("SQUARE");
        roundedSquare.draw();

    }

}
