package com.wade.adam.patterns.creational.factory.wiki;

public class OrdinaryMazeGame extends MazeGame {

    @Override
    protected Room makeRoom() {
        return new OrdinaryRoom();
    }

}
