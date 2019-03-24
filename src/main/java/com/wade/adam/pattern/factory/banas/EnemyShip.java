package com.wade.adam.pattern.factory.banas;

public abstract class EnemyShip {

    private String name;
    private double amtDamage;

    public void followHeroShip(){

        System.out.println(getName() + " is following hero ship!");

    }

    public void displayEnemyShip(){

        System.out.println(getName() + " is on screen!");

    }

    public void enemyShipShoots(){

        System.out.println(getName() + " attacks and does " + getAmtDamage());

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmtDamage() {
        return amtDamage;
    }

    public void setAmtDamage(double amtDamage) {
        this.amtDamage = amtDamage;
    }

}
