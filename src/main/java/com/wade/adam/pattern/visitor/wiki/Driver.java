package com.wade.adam.pattern.visitor.wiki;

public class Driver {

    public static void main(String[] args){

        Car car = new Car();

        car.accept(new CarElementPrintVisitor());
        car.accept(new CarElementActionVisitor());

    }

}
