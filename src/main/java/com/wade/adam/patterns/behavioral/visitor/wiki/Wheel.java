package com.wade.adam.patterns.behavioral.visitor.wiki;

public class Wheel implements CarElementVisitable {

    private final String name;

    public Wheel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}
