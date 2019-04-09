package com.wade.adam.patterns.behavioral.memento.wiki;

public class Driver {

    public static void main(String[] args){

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.addMemento(originator.saveToMemento());

        originator.setState("State #3");
        careTaker.addMemento(originator.saveToMemento());

        originator.setState("State #4");
        originator.restoreFromMemento(careTaker.getMemento(1));
    }

}
