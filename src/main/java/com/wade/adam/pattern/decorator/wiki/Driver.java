package com.wade.adam.pattern.decorator.wiki;

public class Driver {

    public static void main(String[] args){

        Window decoratedWindow =
                new HorizontalScrollbarDecorator(new VerticalScrollbarDecorator(new SimpleWindow()));

        System.out.println(decoratedWindow.getDescription());

    }

}
