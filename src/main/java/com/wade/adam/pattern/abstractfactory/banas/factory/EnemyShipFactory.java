package com.wade.adam.pattern.abstractfactory.banas.factory;

import com.wade.adam.pattern.abstractfactory.banas.engine.ESEngine;
import com.wade.adam.pattern.abstractfactory.banas.weapon.ESWeapon;

public interface EnemyShipFactory {

    ESWeapon addESGun();
    ESEngine addESEngine();

}
