package com.wade.adam.patterns.behavioral.visitor.wiki;

public interface CarElementVisitor {
    void visit(Body body);
    void visit(Car car);
    void visit(Wheel wheel);
    void visit(Engine engine);
}
