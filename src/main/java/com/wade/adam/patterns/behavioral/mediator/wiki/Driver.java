package com.wade.adam.patterns.behavioral.mediator.wiki;

@SuppressWarnings("unchecked")
public class Driver {

    public static void main(String[] args) {
        Mediator mediator = new Mediator<Integer>();
        mediator.setValue("bob", 20);
        mediator.setValue("alice", 24);
        mediator.getValue("alice").ifPresent(age -> System.out.println("age for alice: " + age));

        mediator.addObserver("bob", () -> {
            System.out.println("new age for bob: " + mediator.getValue("bob"));
        });
        mediator.setValue("bob", 21);
    }

}
