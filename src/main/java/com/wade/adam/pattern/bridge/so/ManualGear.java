package com.wade.adam.pattern.bridge.so;

public class ManualGear implements Gear {

    @Override
    public void handleGear() {
        System.out.println("Manual Gear");
    }


}
