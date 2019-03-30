package com.wade.adam.pattern.bridge.banas;

public class DVDDevice extends EntertainmentDevice {

    public DVDDevice(int deviceState, int maxSetting) {

        this.deviceState = deviceState;
        this.maxSetting = maxSetting;

    }

    @Override
    public void buttonFivePressed() {

        System.out.println("DVD Skips To Previous Chapter");
        deviceState--;

    }

    @Override
    public void buttonSixPressed() {

        System.out.println("DVD Skips To Next Chapter");
        deviceState++;

    }
}
