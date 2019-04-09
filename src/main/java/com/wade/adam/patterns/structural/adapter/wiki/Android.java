package com.wade.adam.patterns.structural.adapter.wiki;

public class Android implements MicroUsbPhone {
    private boolean connected;

    @Override
    public void recharge() {
        if (connected) {
            System.out.println("Recharge started");
            System.out.println("Recharge finished");
        } else {
            System.out.println("Connect MicroUsb first");
        }
    }

    @Override
    public void useMicroUsb() {
        connected = true;
        System.out.println("MicroUsb connected");
    }
}
