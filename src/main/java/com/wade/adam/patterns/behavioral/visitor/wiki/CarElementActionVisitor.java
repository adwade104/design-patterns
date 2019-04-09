package com.wade.adam.patterns.behavioral.visitor.wiki;

public class CarElementActionVisitor implements CarElementVisitor {
    @Override
    public void visit(Body body) {
        System.out.println("Moving the body");
    }

    @Override
    public void visit(Car car) {
        System.out.println("Starting the car");
    }

    @Override
    public void visit(Wheel wheel) {
        System.out.println("Kicking my " + wheel.getName() + " wheel");
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("Starting the engine");
    }

}
