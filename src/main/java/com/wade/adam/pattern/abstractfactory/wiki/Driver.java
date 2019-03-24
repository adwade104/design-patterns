package com.wade.adam.pattern.abstractfactory.wiki;

public class Driver {

    public static void main(String[] args){

        ButtonFactory winButtonFactory = ButtonFactoryProvider.getButtonFactory("WIN");

        Button winStartButton = winButtonFactory.getButton("START");
        winStartButton.paint();

        Button winRestartButton = winButtonFactory.getButton("RESTART");
        winRestartButton.paint();

        ButtonFactory osxButtonFactory = ButtonFactoryProvider.getButtonFactory("OSX");

        Button osxStartButton = osxButtonFactory.getButton("START");
        osxStartButton.paint();

        Button osxRestartButton = osxButtonFactory.getButton("RESTART");
        osxRestartButton.paint();

    }


}
