package com.wade.adam.pattern.abstractfactory.banas;

import com.wade.adam.pattern.abstractfactory.banas.factory.EnemyShipFactory;
import com.wade.adam.pattern.abstractfactory.banas.factory.UFOBossEnemyShipFactory;
import com.wade.adam.pattern.abstractfactory.banas.factory.UFOEnemyShipFactory;
import com.wade.adam.pattern.abstractfactory.banas.ship.EnemyShip;
import com.wade.adam.pattern.abstractfactory.banas.ship.UFOBossEnemyShip;
import com.wade.adam.pattern.abstractfactory.banas.ship.UFOEnemyShip;

public class UFOEnemyShipBuilding extends EnemyShipBuilding {

    @Override
    protected EnemyShip makeEnemyShip(String typeOfShip) {
        EnemyShip theEnemyShip = null;

        if(typeOfShip.equals("UFO")){
            EnemyShipFactory shipPartsFactory = new UFOEnemyShipFactory();
            theEnemyShip = new UFOEnemyShip(shipPartsFactory);
            theEnemyShip.setName("UFO Grunt Ship");

        } else if(typeOfShip.equals("UFO BOSS")){
            EnemyShipFactory shipPartsFactory = new UFOBossEnemyShipFactory();
            theEnemyShip = new UFOBossEnemyShip(shipPartsFactory);
            theEnemyShip.setName("UFO Boss Ship");
         }
        return theEnemyShip;

    }

}
