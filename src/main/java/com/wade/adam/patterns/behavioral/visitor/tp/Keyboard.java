package com.wade.adam.patterns.behavioral.visitor.tp;

public class Keyboard implements ComputerPartVisitable {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

}