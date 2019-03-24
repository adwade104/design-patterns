package com.wade.adam.pattern.observer.tp;

public class Driver {

    public static void main(String[] args){

        System.out.println("Creating subject...");

        Subject subject = new Subject();

        System.out.println("Subject created.");

        System.out.println("Registering Binary, Octal, and Hexa Observers...");

        BinaryObserver binaryObserver = new BinaryObserver(subject);
        OctalObserver octalObserver = new OctalObserver(subject);
        HexaObserver hexaObserver = new HexaObserver(subject);

        System.out.println("Observers registered.\n");

        subject.setState(10);

        System.out.println("\nUnregistering all observers...");

        subject.unregister(binaryObserver);
        subject.unregister(octalObserver);
        subject.unregister(hexaObserver);

        System.out.println("Observers unregistered.");

        subject.setState(100); //to show nothing was observed after unregistering observers

    }

}
