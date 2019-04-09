package com.wade.adam.pattern.visitor.wiki;

public interface CarElementVisitable {
    void accept(CarElementVisitor visitor);
}
