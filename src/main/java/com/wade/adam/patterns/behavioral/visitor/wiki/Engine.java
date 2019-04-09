package com.wade.adam.patterns.behavioral.visitor.wiki;

public class Engine implements CarElementVisitable {
    @Override
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}
