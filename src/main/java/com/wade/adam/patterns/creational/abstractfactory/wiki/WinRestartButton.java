package com.wade.adam.patterns.creational.abstractfactory.wiki;

public class WinRestartButton implements Button {
    @Override
    public void paint() {
        System.out.println("WinRestartButton");
    }
}
