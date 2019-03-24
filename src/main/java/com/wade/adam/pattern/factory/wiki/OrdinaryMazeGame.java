package com.wade.adam.pattern.factory.wiki;

public class OrdinaryMazeGame extends MazeGame {

    @Override
    protected Room makeRoom() {
        return new OrdinaryRoom();
    }

}
