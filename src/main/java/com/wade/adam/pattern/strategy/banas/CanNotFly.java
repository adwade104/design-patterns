package com.wade.adam.pattern.strategy.banas;

public class CanNotFly implements Flys {

    @Override
    public String fly() {
        return "I can not fly!";
    }

}
