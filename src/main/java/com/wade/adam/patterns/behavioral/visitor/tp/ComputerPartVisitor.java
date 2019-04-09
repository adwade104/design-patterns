package com.wade.adam.patterns.behavioral.visitor.tp;

public interface ComputerPartVisitor {

    void visit(Computer computer);
    void visit(Mouse mouse);
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);

}
