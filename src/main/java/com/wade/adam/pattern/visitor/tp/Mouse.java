package com.wade.adam.pattern.visitor.tp;

public class Mouse implements ComputerPartVisitable {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

}