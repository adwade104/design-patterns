package com.wade.adam.pattern.abstractfactory.wiki;

public class OSXStartButton implements Button {
    @Override
    public void paint() {
        System.out.println("OSXStartButton");
    }
}
