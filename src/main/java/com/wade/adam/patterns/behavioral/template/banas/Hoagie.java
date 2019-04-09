package com.wade.adam.patterns.behavioral.template.banas;

public abstract class Hoagie {

    final void makeSandwich(){

        cutBun();

        if (customerWantsMeat()){
            addMeat();
        }

        if (customerWantsCheese()){
            addCheese();
        }

        if (customerWantsVegetables()){
            addVegetables();
        }

        if (customerWantsCondiments()){
            addCondiments();
        }

        wrapHoagie();

    }

    public void cutBun(){ System.out.println("The Hoagie Is Cut"); }

    public abstract void addMeat();
    public abstract void addCheese();
    public abstract void addVegetables();
    public abstract void addCondiments();

    public boolean customerWantsMeat(){ return true; }
    public boolean customerWantsCheese(){ return true; }
    public boolean customerWantsVegetables(){ return true; }
    public boolean customerWantsCondiments(){ return true; }

    public void wrapHoagie(){ System.out.println("The Hoagie Is Wrapped"); }

}
