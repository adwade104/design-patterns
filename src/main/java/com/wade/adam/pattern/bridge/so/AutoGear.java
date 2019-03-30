package com.wade.adam.pattern.bridge.so;

public class AutoGear implements Gear {

    @Override
    public void handleGear() {
        System.out.println("Auto Gear");
    }

}
