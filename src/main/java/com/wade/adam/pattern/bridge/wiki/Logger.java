package com.wade.adam.pattern.bridge.wiki;

public interface Logger {

    void log(String message);

    static Logger info() {
        return message -> System.out.println("info: " + message);
    }
    static Logger warning() {
        return message -> System.out.println("warning: " + message);
    }

}
