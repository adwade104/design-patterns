package com.wade.adam.patterns.behavioral.strategy.wiki;

public class Brake implements BrakeBehavior {
    @Override
    public String brake() {
        return "Simple brake applied!";
    }
}
