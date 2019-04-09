package com.wade.adam.patterns.creational.prototype.wiki;

public abstract class Prototype implements Cloneable {

    public Prototype clone() throws CloneNotSupportedException{
        return (Prototype) super.clone();
    }

}
