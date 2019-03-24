package com.wade.adam.pattern.strategy.wiki;

public class Brake implements BrakeBehavior {
    @Override
    public String brake() {
        return "Simple brake applied!";
    }
}
