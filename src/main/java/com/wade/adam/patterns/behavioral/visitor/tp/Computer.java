package com.wade.adam.patterns.behavioral.visitor.tp;

public class Computer implements ComputerPartVisitable {

    ComputerPartVisitable[] parts;

    public Computer(){
        parts = new ComputerPartVisitable[] {new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPartVisitable part : parts) {
            part.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}