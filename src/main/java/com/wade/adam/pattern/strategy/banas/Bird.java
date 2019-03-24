package com.wade.adam.pattern.strategy.banas;

public class Bird extends Animal {

    public Bird(){

        setSound("Tweet");
        flyingType = new ItFlys();

    }

}