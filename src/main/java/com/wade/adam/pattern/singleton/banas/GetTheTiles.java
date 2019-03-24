package com.wade.adam.pattern.singleton.banas;

import java.util.List;

public class GetTheTiles implements Runnable {

    @Override
    public void run() {

        Singleton newInstance = Singleton.getInstance();

        System.out.println("Instance ID: " + System.identityHashCode(newInstance));

        System.out.println(newInstance.getLetterList());

        List<String> playerTiles = newInstance.getTiles(7);

        System.out.println("Player: " + playerTiles);

        System.out.println("Got tiles!");
    }

}
