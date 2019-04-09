package com.wade.adam.patterns.behavioral.template.tp;

public class Driver {

    public static void main(String[] args){

        Game game = new Cricket();
        game.play();

        System.out.println();

        game = new Football();
        game.play();

        System.out.println();

        game = new Baseball();
        game.play();

    }

}
