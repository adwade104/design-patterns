package com.wade.adam.patterns.behavioral.visitor.tp;

public class Monitor implements ComputerPartVisitable {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

}
