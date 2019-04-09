package com.wade.adam.patterns.behavioral.strategy.banas;

public class CanNotFly implements Flys {

    @Override
    public String fly() {
        return "I can not fly!";
    }

}
