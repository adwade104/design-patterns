package com.wade.adam.patterns.creational.builder.banas;

public interface RobotBuilder {

    void buildRobotHead();
    void buildRobotTorso();
    void buildRobotArms();
    void buildRobotLegs();
    Robot getRobot();

}
