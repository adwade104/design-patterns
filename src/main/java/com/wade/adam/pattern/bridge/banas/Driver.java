package com.wade.adam.pattern.bridge.banas;

public class Driver {

    @SuppressWarnings("Duplicates")
    public static void main(String[] args){

        System.out.println("Test TV With Mute");
        RemoteButton theTV = new TVRemoteMute(new TVDevice(1,200));
        theTV.buttonFivePressed();
        theTV.buttonSixPressed();
        theTV.buttonNinePressed();

        System.out.println("\nTest TV With Pause");
        RemoteButton theTV2 = new TVRemotePause(new TVDevice(1,200));
        theTV2.buttonFivePressed();
        theTV2.buttonSixPressed();
        theTV2.buttonSixPressed();
        theTV2.buttonSixPressed();
        theTV2.buttonSixPressed();
        theTV2.buttonNinePressed();
        theTV2.deviceFeedback();

        System.out.println("\nTest DVD");
        RemoteButton theDVD = new DVDRemote(new DVDDevice(1,14));
        theDVD.buttonFivePressed();
        theDVD.buttonSixPressed();
        theDVD.buttonSixPressed();
        theDVD.buttonNinePressed();
        theDVD.buttonNinePressed();
        theDVD.deviceFeedback();

    }



}
