package com.wade.adam.pattern.bridge.banas;

public class TVDevice extends EntertainmentDevice {

    public TVDevice(int deviceState, int maxSetting) {

        this.deviceState = deviceState;
        this.maxSetting = maxSetting;

    }

    @Override
    public void buttonFivePressed() {

        System.out.println("Channel Down");
        deviceState--;

    }

    @Override
    public void buttonSixPressed() {

        System.out.println("Channel Up");
        deviceState++;

    }

}
