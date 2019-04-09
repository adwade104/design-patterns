package com.wade.adam.patterns.creational.abstractfactory.banas.factory;

import com.wade.adam.patterns.creational.abstractfactory.banas.engine.ESEngine;
import com.wade.adam.patterns.creational.abstractfactory.banas.engine.ESUFOBossEngine;
import com.wade.adam.patterns.creational.abstractfactory.banas.weapon.ESUFOBossGun;
import com.wade.adam.patterns.creational.abstractfactory.banas.weapon.ESWeapon;

public class UFOBossEnemyShipFactory implements EnemyShipFactory {
    @Override
    public ESWeapon addESGun() {
        return new ESUFOBossGun();
    }

    @Override
    public ESEngine addESEngine() {
        return new ESUFOBossEngine();
    }
}
