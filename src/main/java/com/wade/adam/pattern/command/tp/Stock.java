package com.wade.adam.pattern.command.tp;

public class Stock implements IStock {

    private String name;
    private int quantity;

    public Stock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void buy(){
        System.out.println("IStock [ Name: "+name+", Quantity: " + quantity +" ] bought");
    }

    public void sell(){
        System.out.println("IStock [ Name: "+name+", Quantity: " + quantity +" ] sold");
    }

}
