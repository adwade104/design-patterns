package com.wade.adam.pattern.decorator.banas;

public class PlainPizza implements Pizza {

    public PlainPizza() {
        System.out.println("Adding Dough");
    }

    @Override
    public String getDescription() {
        return "Thin Dough";
    }

    @Override
    public double getCost() {
        return 4.00;
    }
}
