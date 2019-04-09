package com.wade.adam.patterns.creational.abstractfactory.tp;

public class FactoryProvider {

    public static AbstractFactory getFactory(boolean rounded){
        return rounded ? new RoundedShapeFactory() : new ShapeFactory();
    }

}
