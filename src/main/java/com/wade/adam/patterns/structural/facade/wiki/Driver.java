package com.wade.adam.patterns.structural.facade.wiki;

public class Driver {

    public static void main(String[] args){

        ComputerFacade computerFacade = new ComputerFacade();
        computerFacade.start();

    }

}
