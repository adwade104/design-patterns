package com.wade.adam.pattern.visitor.tp;

public interface ComputerPartVisitable {
    void accept(ComputerPartVisitor computerPartVisitor);
}
