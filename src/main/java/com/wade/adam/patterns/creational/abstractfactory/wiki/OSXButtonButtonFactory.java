package com.wade.adam.patterns.creational.abstractfactory.wiki;

public class OSXButtonButtonFactory extends ButtonFactory {
    @Override
    public Button getButton(String buttonType) {
        if("START".equalsIgnoreCase(buttonType)){
            return new OSXStartButton();
        } else if("RESTART".equalsIgnoreCase(buttonType)){
            return new OSXRestartButton();
        }

        return null;
    }
}
