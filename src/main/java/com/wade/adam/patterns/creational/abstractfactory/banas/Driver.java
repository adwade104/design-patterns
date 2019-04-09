package com.wade.adam.patterns.creational.abstractfactory.banas;

import com.wade.adam.patterns.creational.abstractfactory.banas.ship.EnemyShip;

public class Driver {

    public static void main(String[] args){

        EnemyShipBuilding makeUFOs = new UFOEnemyShipBuilding();

        EnemyShip theGrunt = makeUFOs.orderTheShip("UFO");
        System.out.println(theGrunt + "\n");

        EnemyShip theBoss = makeUFOs.orderTheShip("UFO BOSS");
        System.out.println(theBoss + "\n");

    }

}
