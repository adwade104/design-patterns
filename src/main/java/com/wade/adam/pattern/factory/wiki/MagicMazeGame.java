package com.wade.adam.pattern.factory.wiki;

public class MagicMazeGame extends MazeGame {

    @Override
    protected Room makeRoom() {
        return new MagicRoom();
    }

}
