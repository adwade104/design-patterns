package com.wade.adam.patterns.behavioral.visitor.wiki;

public class Body implements CarElementVisitable {

    @Override
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}
