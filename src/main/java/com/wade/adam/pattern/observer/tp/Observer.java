package com.wade.adam.pattern.observer.tp;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
