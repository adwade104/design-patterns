package com.wade.adam.patterns.creational.abstractfactory.tp;

public class RoundedShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {

        if("RECTANGLE".equalsIgnoreCase(shapeType)){
            return new RoundedRectangle();
        }
        else if("SQUARE".equalsIgnoreCase(shapeType)){
            return new RoundedSquare();
        }

        return null;
    }

}
