package com.wade.adam.pattern.strategy.wiki;

public class Driver {

    public static void main(String[] args){

        Car sedan = new Sedan();
        System.out.println("Sedan: " + sedan.applyBrake());

        Car suv = new Suv();
        System.out.println("Suv: " + suv.applyBrake());

        suv.setBrakeBehavior(new Brake());
        System.out.println("Suv: " + suv.applyBrake());

    }

}
