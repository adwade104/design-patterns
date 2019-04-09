package com.wade.adam.patterns.creational.prototype.banas;

public class CloneFactory {

    public Animal getClone(Animal animal){

        return animal.makeCopy();

    }

}
