package com.wade.adam.pattern.singleton.wiki;

public class Driver {

    public static void main(String[] args){

        Singleton singleton = Singleton.getInstance();
        ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();

    }

}
