package com.wade.adam.pattern.adapter.banas;

public class Driver {

    public static void main(String[] args){

        System.out.println("The Tank");

        EnemyTank enemyTank = new EnemyTank();
        enemyTank.assignDriver("Frank");
        enemyTank.driveForward();
        enemyTank.fireWeapon();

        System.out.println("\nThe Robot");

        EnemyRobot fredTheRobot = new EnemyRobot();
        fredTheRobot.reactToHuman("Paul");
        fredTheRobot.walkForward();
        fredTheRobot.smashWithHands();

        System.out.println("\nThe Robot With Adapter");

        EnemyAttacker robot = new EnemyRobotAdapter(fredTheRobot);
        robot.assignDriver("Mark");
        robot.driveForward();
        robot.fireWeapon();

    }


}
