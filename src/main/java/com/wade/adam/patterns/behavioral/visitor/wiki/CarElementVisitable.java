package com.wade.adam.patterns.behavioral.visitor.wiki;

public interface CarElementVisitable {
    void accept(CarElementVisitor visitor);
}
