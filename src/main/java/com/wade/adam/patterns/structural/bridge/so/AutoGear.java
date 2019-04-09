package com.wade.adam.patterns.structural.bridge.so;

public class AutoGear implements Gear {

    @Override
    public void handleGear() {
        System.out.println("Auto Gear");
    }

}
