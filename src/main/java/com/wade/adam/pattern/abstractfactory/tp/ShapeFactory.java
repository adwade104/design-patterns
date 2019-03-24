package com.wade.adam.pattern.abstractfactory.tp;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {

        if("RECTANGLE".equalsIgnoreCase(shapeType)){
            return new Rectangle();
        } else if ("SQUARE".equalsIgnoreCase(shapeType)){
            return new Square();
        }

        return null;
    }

}
