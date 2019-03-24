package com.wade.adam.pattern.abstractfactory.tp;

public class FactoryProvider {

    public static AbstractFactory getFactory(boolean rounded){
        return rounded ? new RoundedShapeFactory() : new ShapeFactory();
    }

}
