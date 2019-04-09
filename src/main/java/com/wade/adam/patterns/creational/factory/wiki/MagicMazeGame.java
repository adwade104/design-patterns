package com.wade.adam.patterns.creational.factory.wiki;

public class MagicMazeGame extends MazeGame {

    @Override
    protected Room makeRoom() {
        return new MagicRoom();
    }

}
