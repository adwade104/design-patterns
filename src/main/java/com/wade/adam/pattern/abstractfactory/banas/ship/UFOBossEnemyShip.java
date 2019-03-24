package com.wade.adam.pattern.abstractfactory.banas.ship;

import com.wade.adam.pattern.abstractfactory.banas.factory.EnemyShipFactory;

public class UFOBossEnemyShip extends EnemyShip{

    private EnemyShipFactory shipFactory;

    public UFOBossEnemyShip(EnemyShipFactory shipFactory) {
        this.shipFactory = shipFactory;
    }

    @Override
    public void makeShip() {
        System.out.println("Making enemy ship " + getName());

        weapon = shipFactory.addESGun();
        engine = shipFactory.addESEngine();
    }


}
