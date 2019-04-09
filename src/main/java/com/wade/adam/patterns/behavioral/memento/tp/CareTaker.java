package com.wade.adam.patterns.behavioral.memento.tp;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    private List<Memento> mementos = new ArrayList<>();

    public void addMemento(Memento state){
        mementos.add(state);
    }

    public Memento getMemento(int index){
        return mementos.get(index);
    }

}
