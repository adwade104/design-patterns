package com.wade.adam.patterns.creational.singleton.wiki;

public final class ThreadSafeSingleton {

    private static volatile ThreadSafeSingleton instance = null;

    private ThreadSafeSingleton() {}

    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized(ThreadSafeSingleton.class) { //research class level locking
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }

        return instance;
    }

}
