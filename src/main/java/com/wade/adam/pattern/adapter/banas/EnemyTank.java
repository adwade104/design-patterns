package com.wade.adam.pattern.adapter.banas;

import java.util.Random;

public class EnemyTank implements EnemyAttacker {

    private Random generator = new Random();

    @Override
    public void fireWeapon() {

        int attackDamage = generator.nextInt(10) + 1;
        System.out.println("Enemy Tank Does " + attackDamage + " Damage");

    }

    @Override
    public void driveForward() {

        int movement = generator.nextInt(5) + 1;
        System.out.println("Enemy Tank Moves " + movement + " Spaces");

    }

    @Override
    public void assignDriver(String driverName) {

        System.out.println(driverName + " Is Driving The Tank");

    }

}
