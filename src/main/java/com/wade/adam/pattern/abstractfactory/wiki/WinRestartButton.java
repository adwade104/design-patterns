package com.wade.adam.pattern.abstractfactory.wiki;

public class WinRestartButton implements Button {
    @Override
    public void paint() {
        System.out.println("WinRestartButton");
    }
}
