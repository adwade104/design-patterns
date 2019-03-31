package com.wade.adam.pattern.template.banas;

public class VeggieHoagie extends Hoagie {

    private String[] veggiesUsed = { "Lettuce", "Tomatoes", "Onions", "Sweet Peppers" };
    private String[] condimentsUsed = { "Oil", "Vinegar" };

    public boolean customerWantsMeat(){ return false; }
    public boolean customerWantsCheese(){ return false; }

    @Override
    public void addMeat() {}

    @Override
    public void addCheese() {}

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
