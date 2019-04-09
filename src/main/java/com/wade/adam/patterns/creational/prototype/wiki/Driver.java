package com.wade.adam.patterns.creational.prototype.wiki;

public class Driver {

    public static void main(String[] args) throws CloneNotSupportedException {

        ConcretePrototypeOne concretePrototypeOne = new ConcretePrototypeOne();
        ConcretePrototypeOne cloneOne = (ConcretePrototypeOne) concretePrototypeOne.clone();

        System.out.println("ConcretePrototypeOne Hashcode: " + System.identityHashCode(concretePrototypeOne));
        System.out.println("CloneOne Hashcode: " + System.identityHashCode(cloneOne));

        System.out.println("\n");

        ConcretePrototypeTwo concretePrototypeTwo = new ConcretePrototypeTwo();
        ConcretePrototypeTwo cloneTwo = (ConcretePrototypeTwo) concretePrototypeTwo.clone();

        System.out.println("ConcretePrototypeTwo Hashcode: " + System.identityHashCode(concretePrototypeTwo));
        System.out.println("CloneTwo Hashcode: " + System.identityHashCode(cloneTwo));

    }

}
