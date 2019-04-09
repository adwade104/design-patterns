package com.wade.adam.patterns.behavioral.memento.tp;

public class Originator {

    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public String restoreStateFromMemento(Memento memento){
        state = memento.getState();
        return state;
    }

}
