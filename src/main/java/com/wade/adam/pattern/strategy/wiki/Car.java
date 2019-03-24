package com.wade.adam.pattern.strategy.wiki;

import com.wade.adam.pattern.strategy.wiki.BrakeBehavior;

public abstract class Car {

    private BrakeBehavior brakeBehavior;

    public Car(BrakeBehavior brakeBehavior) {
        this.brakeBehavior = brakeBehavior;
    }

    public String applyBrake() {
        return brakeBehavior.brake();
    }

    public void setBrakeBehavior(BrakeBehavior brakeType) {
        this.brakeBehavior = brakeType;
    }

}
