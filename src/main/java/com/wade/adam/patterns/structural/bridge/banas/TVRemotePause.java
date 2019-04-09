package com.wade.adam.patterns.structural.bridge.banas;

public class TVRemotePause extends RemoteButton {

    public TVRemotePause(EntertainmentDevice entertainmentDevice) {
        super(entertainmentDevice);
    }

    @Override
    public void buttonNinePressed() {

        System.out.println("TV Was Paused");

    }

}
