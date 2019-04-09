package com.wade.adam.pattern.visitor.wiki;

public class CarElementPrintVisitor implements CarElementVisitor {

    @Override
    public void visit(Body body) {
        System.out.println("Visiting body");
    }

    @Override
    public void visit(Car car) {
        System.out.println("Visiting car");
    }

    @Override
    public void visit(Wheel wheel) {
        System.out.println("Visiting " + wheel.getName() + " wheel");
    }


    @Override
    public void visit(Engine engine) {
        System.out.println("Visiting engine");
    }
    
}
