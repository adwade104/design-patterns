package com.wade.adam.pattern.abstractfactory.wiki;

public class WinButtonButtonFactory extends ButtonFactory {
    @Override
    public Button getButton(String buttonType) {

        if ("START".equalsIgnoreCase(buttonType)){
            return new WinStartButton();
        }
        else if ("RESTART".equalsIgnoreCase(buttonType)){
            return new WinRestartButton();
        }

        return null;
    }
}
