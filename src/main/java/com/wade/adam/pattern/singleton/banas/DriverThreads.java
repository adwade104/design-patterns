package com.wade.adam.pattern.singleton.banas;

public class DriverThreads {

    public static void main(String[] args){

        Runnable getTiles = new GetTheTiles();
        Runnable getTilesAgain = new GetTheTiles();

        new Thread(getTiles).start();
        new Thread(getTilesAgain).start();

    }

}
