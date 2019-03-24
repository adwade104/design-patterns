package com.wade.adam.pattern.strategy.banas;

public class Driver {

    public static void main(String[] args){

        Animal sparky = new Dog();
        Animal tweety = new Bird();

        System.out.println("Dog: " + sparky.tryToFly());
        System.out.println("Bird: " + tweety.tryToFly());

        sparky.setFlyingType(new ItFlys());

        System.out.println("Dog: " + sparky.tryToFly());

    }


}
