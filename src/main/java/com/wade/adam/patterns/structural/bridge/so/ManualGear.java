package com.wade.adam.patterns.structural.bridge.so;

public class ManualGear implements Gear {

    @Override
    public void handleGear() {
        System.out.println("Manual Gear");
    }


}
