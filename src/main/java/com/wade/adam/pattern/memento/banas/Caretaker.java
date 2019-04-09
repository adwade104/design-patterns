package com.wade.adam.pattern.memento.banas;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

    private List<Memento> articles = new ArrayList<>();

    public void addMemento(Memento m){

        articles.add(m);

    }

    public Memento getMemento(int index){

        return articles.get(index);

    }


}
