package com.wade.adam.pattern.prototype.banas;

public class CloneFactory {

    public Animal getClone(Animal animal){

        return animal.makeCopy();

    }

}
