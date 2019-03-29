package com.wade.adam.pattern.facade.wiki;

public class Memory {

    public void load(long position, byte[] data) {

        System.out.println("Loading ram at position: " + position);
        System.out.println("Num bytes loaded: " + data.length);

    }

}
