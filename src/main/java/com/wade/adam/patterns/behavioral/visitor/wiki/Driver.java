package com.wade.adam.patterns.behavioral.visitor.wiki;

public class Driver {

    public static void main(String[] args){

        Car car = new Car();

        car.accept(new CarElementPrintVisitor());
        car.accept(new CarElementActionVisitor());

    }

}
