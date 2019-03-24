package com.wade.adam.pattern.abstractfactory.wiki;

public class OSXRestartButton implements Button {
    @Override
    public void paint() {
        System.out.println("OSXRestartButton");
    }
}
