package com.wade.adam.pattern.observer.banas;

public interface Subject {

    void register(Observer o);
    void unregister(Observer o);
    void notifyObserver();

}
