package com.wade.adam.patterns.structural.bridge.wiki;

public interface Logger {

    void log(String message);

    static Logger info() {
        return message -> System.out.println("info: " + message);
    }
    static Logger warning() {
        return message -> System.out.println("warning: " + message);
    }

}
