package com.wade.adam.pattern.visitor.tp;

public class Keyboard implements ComputerPartVisitable {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

}