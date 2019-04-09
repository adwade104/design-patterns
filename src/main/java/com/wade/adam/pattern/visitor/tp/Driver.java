package com.wade.adam.pattern.visitor.tp;

public class Driver {

    public static void main(String[] args){

        ComputerPartVisitable computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());

    }

}
