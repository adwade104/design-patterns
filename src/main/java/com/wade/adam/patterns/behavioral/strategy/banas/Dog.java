package com.wade.adam.patterns.behavioral.strategy.banas;

public class Dog extends Animal {

    public Dog(){

        setSound("Bark");
        flyingType = new CanNotFly();

    }

    public void digHole(){

        System.out.println("Dug a hole");

    }

}
