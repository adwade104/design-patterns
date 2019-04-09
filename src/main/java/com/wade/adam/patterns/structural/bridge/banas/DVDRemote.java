package com.wade.adam.patterns.structural.bridge.banas;

public class DVDRemote extends RemoteButton {

    private boolean play = true;

    public DVDRemote(EntertainmentDevice entertainmentDevice) {
        super(entertainmentDevice);
    }

    @Override
    public void buttonNinePressed() {

        play = !play;
        System.out.println("DVD is Playing: " + play);

    }


}
