package com.wade.adam.patterns.behavioral.observer.banas;

public interface Subject {

    void register(Observer o);
    void unregister(Observer o);
    void notifyObserver();

}
