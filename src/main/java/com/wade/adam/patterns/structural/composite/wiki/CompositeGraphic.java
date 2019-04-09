package com.wade.adam.patterns.structural.composite.wiki;

import java.util.ArrayList;
import java.util.List;

public class CompositeGraphic implements Graphic {

    private final List<Graphic> childGraphics = new ArrayList<>();

    public void add(Graphic graphic) {
        childGraphics.add(graphic);
    }

    public void removeGraphic(Graphic graphic){
        childGraphics.remove(graphic);
    }

    @Override
    public void print() {
        for (Graphic graphic : childGraphics) {
            graphic.print();
        }
    }

}
