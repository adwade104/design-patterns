package com.wade.adam.pattern.visitor.tp;

public class Monitor implements ComputerPartVisitable {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

}
