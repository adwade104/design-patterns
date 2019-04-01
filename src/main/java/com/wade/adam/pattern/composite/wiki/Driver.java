package com.wade.adam.pattern.composite.wiki;

public class Driver {

    public static void main(String[] args){

        Ellipse ellipse1 = new Ellipse();
        Ellipse ellipse2 = new Ellipse();
        Ellipse ellipse3 = new Ellipse();
        Ellipse ellipse4 = new Ellipse();

        CompositeGraphic graphic2 = new CompositeGraphic();
        graphic2.add(ellipse1);
        graphic2.add(ellipse2);
        graphic2.add(ellipse3);

        CompositeGraphic graphic3 = new CompositeGraphic();
        graphic3.add(ellipse4);

        CompositeGraphic graphic1 = new CompositeGraphic();
        graphic1.add(graphic2);
        graphic1.add(graphic3);

        graphic1.print();

    }

}
