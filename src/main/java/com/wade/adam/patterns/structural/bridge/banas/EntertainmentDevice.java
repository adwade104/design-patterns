package com.wade.adam.patterns.structural.bridge.banas;

public abstract class EntertainmentDevice {


    public int deviceState; //Channel device is on, or chapter if we are using DVD

    public int maxSetting; //Max channel, or max chapter if we are using DVD

    public int volumeLevel = 0; //Volume setting for either

    public abstract void buttonFivePressed();

    public abstract void buttonSixPressed();

    public void deviceFeedback(){

        if(deviceState > maxSetting || deviceState < 0){
            deviceState = 0;
        }

        System.out.println("On " + deviceState);


    }

    public void buttonSevenPressed(){

        volumeLevel++;
        System.out.println("Volume at: " + volumeLevel);

    }

    public void buttonEightPressed(){

        volumeLevel--;
        System.out.println("Volume at: " + volumeLevel);

    }




}
