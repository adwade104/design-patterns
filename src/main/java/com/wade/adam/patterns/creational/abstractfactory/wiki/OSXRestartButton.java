package com.wade.adam.patterns.creational.abstractfactory.wiki;

public class OSXRestartButton implements Button {
    @Override
    public void paint() {
        System.out.println("OSXRestartButton");
    }
}
