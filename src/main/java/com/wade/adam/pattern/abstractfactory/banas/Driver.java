package com.wade.adam.pattern.abstractfactory.banas;

import com.wade.adam.pattern.abstractfactory.banas.ship.EnemyShip;

public class Driver {

    public static void main(String[] args){

        EnemyShipBuilding makeUFOs = new UFOEnemyShipBuilding();

        EnemyShip theGrunt = makeUFOs.orderTheShip("UFO");
        System.out.println(theGrunt + "\n");

        EnemyShip theBoss = makeUFOs.orderTheShip("UFO BOSS");
        System.out.println(theBoss + "\n");

    }

}
