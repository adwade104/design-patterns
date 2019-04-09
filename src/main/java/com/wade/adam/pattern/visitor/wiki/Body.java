package com.wade.adam.pattern.visitor.wiki;

public class Body implements CarElementVisitable {

    @Override
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}
