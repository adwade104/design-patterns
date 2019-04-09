package com.wade.adam.patterns.creational.abstractfactory.banas.factory;

import com.wade.adam.patterns.creational.abstractfactory.banas.engine.ESEngine;
import com.wade.adam.patterns.creational.abstractfactory.banas.weapon.ESWeapon;

public interface EnemyShipFactory {

    ESWeapon addESGun();
    ESEngine addESEngine();

}
