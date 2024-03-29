package com.wade.adam.patterns.creational.abstractfactory.banas.factory;

import com.wade.adam.patterns.creational.abstractfactory.banas.engine.ESEngine;
import com.wade.adam.patterns.creational.abstractfactory.banas.engine.ESUFOEngine;
import com.wade.adam.patterns.creational.abstractfactory.banas.weapon.ESUFOGun;
import com.wade.adam.patterns.creational.abstractfactory.banas.weapon.ESWeapon;

public class UFOEnemyShipFactory implements EnemyShipFactory {

    @Override
    public ESWeapon addESGun() {
        return new ESUFOGun();
    }

    @Override
    public ESEngine addESEngine() {
        return new ESUFOEngine();
    }

}
