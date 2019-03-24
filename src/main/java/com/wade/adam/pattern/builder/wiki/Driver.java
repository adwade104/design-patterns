package com.wade.adam.pattern.builder.wiki;

public class Driver {

    public static void main(String[] args){

        Car car = new CarBuilder()
                .setColor("Green")
                .setWheels(4)
                .build();

        System.out.println(car.toString());

    }


}
