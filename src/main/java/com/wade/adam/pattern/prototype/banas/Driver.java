package com.wade.adam.pattern.prototype.banas;

public class Driver {

    public static void main(String[] args){

        CloneFactory factory = new CloneFactory();

        Sheep sally = new Sheep();

        Sheep clonedSheep = (Sheep) factory.getClone(sally);

        System.out.println(sally);
        System.out.println(clonedSheep);

        System.out.println("Sally Hashcode: " + System.identityHashCode(sally));
        System.out.println("Clone Hashcode: " + System.identityHashCode(clonedSheep));

    }

}
