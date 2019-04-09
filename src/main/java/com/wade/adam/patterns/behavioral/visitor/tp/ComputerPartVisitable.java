package com.wade.adam.patterns.behavioral.visitor.tp;

public interface ComputerPartVisitable {
    void accept(ComputerPartVisitor computerPartVisitor);
}
