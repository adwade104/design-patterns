package com.wade.adam.pattern.mediator.wiki;

public class Storage<T> {

    T value;

    T getValue() {
        return value;
    }
    void setValue(Mediator<T> mediator, String storageName, T value) {
        this.value = value;
        mediator.notifyObservers(storageName);
    }

}
