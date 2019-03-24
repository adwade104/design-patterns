package com.wade.adam.pattern.factory.tp;

public class ShapeFactory {

    public Shape getShape(String shapeName){
        if("Rectangle".equalsIgnoreCase(shapeName)){
            return new Rectangle();
        }
        else if("Square".equalsIgnoreCase(shapeName)){
            return new Square();
        }
        else if("Circle".equalsIgnoreCase(shapeName)){
            return new Circle();
        }

        return null;

    }

}
