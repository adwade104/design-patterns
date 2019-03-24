package com.wade.adam.pattern.singleton.banas;

import java.util.List;

public class Driver {

    public static void main(String[] args)  {

        Singleton newInstance = Singleton.getInstance();

        System.out.println("Instance 1 ID: " + System.identityHashCode(newInstance));

        System.out.println(newInstance.getLetterList());

        List<String> playerOnesTiles = newInstance.getTiles(7);

        System.out.println("Player One Tiles: " + playerOnesTiles);

        System.out.println(newInstance.getLetterList());

        Singleton instanceTwo = Singleton.getInstance();

        System.out.println("Instance 2 ID: " + System.identityHashCode(instanceTwo));

        System.out.println(instanceTwo.getLetterList());

        List<String> playerTwoTiles = newInstance.getTiles(7);

        System.out.println("Player Two Tiles: " + playerTwoTiles);


    }

}
