package com.wade.adam.pattern.abstractfactory.wiki;

public class WinStartButton implements Button {
    @Override
    public void paint() {
        System.out.println("WinStartButton");
    }
}
