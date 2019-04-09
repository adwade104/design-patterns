package com.wade.adam.patterns.structural.decorator.banas;

public class Driver {

    public static void main(String[] args){

        PlainPizza plainPizza = new PlainPizza();
        Mozzarella mozzarella = new Mozzarella(plainPizza);
        Pizza basicPizza = new TomatoSauce(mozzarella);

        System.out.println("Ingredients: " + basicPizza.getDescription());
        System.out.println("Price: " + basicPizza.getCost());
    }

}
