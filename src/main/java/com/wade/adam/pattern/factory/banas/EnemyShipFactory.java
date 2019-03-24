package com.wade.adam.pattern.factory.banas;

public class EnemyShipFactory {

    public EnemyShip makeEnemyShip(String newShipType){

        if ("U".equalsIgnoreCase(newShipType)){
            return new UFOEnemyShip();
        }
        else if("R".equalsIgnoreCase(newShipType)){
            return new RocketEnemyShip();
        }
        else if("B".equalsIgnoreCase(newShipType)){
            return new BigUFOEnemyShip();
        }

        return null;

    }

}
