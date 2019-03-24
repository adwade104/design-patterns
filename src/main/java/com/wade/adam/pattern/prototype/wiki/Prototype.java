package com.wade.adam.pattern.prototype.wiki;

public abstract class Prototype implements Cloneable {

    public Prototype clone() throws CloneNotSupportedException{
        return (Prototype) super.clone();
    }

}
