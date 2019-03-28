package com.wade.adam.pattern.adapter.banas;

public class EnemyRobotAdapter implements EnemyAttacker {

    private EnemyRobot robot;

    public EnemyRobotAdapter(EnemyRobot robot) {
        this.robot = robot;
    }

    @Override
    public void fireWeapon() {
        robot.smashWithHands();
    }

    @Override
    public void driveForward() {
        robot.walkForward();
    }

    @Override
    public void assignDriver(String driverName) {
        robot.reactToHuman(driverName);
    }

}
