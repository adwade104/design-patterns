package com.wade.adam.patterns.behavioral.strategy.banas;

public class Bird extends Animal {

    public Bird(){

        setSound("Tweet");
        flyingType = new ItFlys();

    }

}