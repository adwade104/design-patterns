package com.wade.adam.pattern.template.banas;

public class ItalianHoagie extends Hoagie {

    private String[] meatsUsed = { "Salami", "Pepperoni", "Capicola Ham" };
    private String[] cheesesUsed = { "Provolone" };
    private String[] veggiesUsed = { "Lettuce", "Tomatoes", "Onions", "Sweet Peppers" };
    private String[] condimentsUsed = { "Oil", "Vinegar" };

    @Override
    public void addMeat() {

        System.out.print("Adding The Meat: ");

        for(String meat : meatsUsed){
            System.out.print(meat + " ");
        }

        System.out.println();
    }

    @Override
    public void addCheese() {

        System.out.print("Adding The Cheese: ");

        for(String cheese : cheesesUsed){
            System.out.print(cheese + " ");
        }

        System.out.println();
    }

    @Override
    public void addVegetables() {

        System.out.print("Adding The Vegetables: ");

        for(String vegetable : veggiesUsed){
            System.out.print(vegetable + " ");
        }

        System.out.println();
    }

    @Override
    public void addCondiments() {

        System.out.print("Adding The Condiments: ");

        for(String condiment : condimentsUsed){
            System.out.print(condiment + " ");
        }

        System.out.println();

    }

}
