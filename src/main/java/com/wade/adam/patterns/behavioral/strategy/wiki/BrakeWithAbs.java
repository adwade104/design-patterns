package com.wade.adam.patterns.behavioral.strategy.wiki;

public class BrakeWithAbs implements BrakeBehavior {

    @Override
    public String brake() {
        return "Brake with ABS applied!";
    }

}
