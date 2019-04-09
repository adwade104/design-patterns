package com.wade.adam.patterns.behavioral.template.tp;

public class Baseball extends Game {

    @Override
    void initialize() {
        System.out.println("Baseball Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Baseball Game Started. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Baseball Game Finished!");
    }

}
