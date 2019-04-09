package com.wade.adam.patterns.creational.abstractfactory.banas.ship;

import com.wade.adam.patterns.creational.abstractfactory.banas.engine.ESEngine;
import com.wade.adam.patterns.creational.abstractfactory.banas.weapon.ESWeapon;

public abstract class EnemyShip {

    private String name;
    protected ESWeapon weapon;
    protected ESEngine engine;

    public abstract void makeShip();

    public String getName() { return name; }

    public void setName(String newName) { name = newName; }

    public void followHeroShip(){
        System.out.println(name + " is following the hero at " + engine);
    }

    public void displayEnemyShip(){
        System.out.println(name + " is on the screen");
    }

    public void enemyShipShoots(){

        System.out.println(name + " attacks and does " + weapon);
    }

    public String toString(){

        return "The " + name + " has a top speed of " + engine +
        " and an attack power of " + weapon;

    }

}
