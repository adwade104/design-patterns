package com.wade.adam.patterns.structural.decorator.wiki;

public class Driver {

    public static void main(String[] args){

        Window decoratedWindow =
                new HorizontalScrollbarDecorator(new VerticalScrollbarDecorator(new SimpleWindow()));

        System.out.println(decoratedWindow.getDescription());

    }

}
