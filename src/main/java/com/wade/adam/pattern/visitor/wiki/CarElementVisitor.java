package com.wade.adam.pattern.visitor.wiki;

public interface CarElementVisitor {
    void visit(Body body);
    void visit(Car car);
    void visit(Wheel wheel);
    void visit(Engine engine);
}
