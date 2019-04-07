package com.wade.adam.pattern.proxy.banas;

public class NoCash implements ATMState {

    private ATMMachine atmMachine;

    public NoCash(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("No Money");
    }

    @Override
    public void ejectCard() {
        System.out.println("No Money. You Did Not Enter a Card");
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("No Money");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("No Money");
    }

}
