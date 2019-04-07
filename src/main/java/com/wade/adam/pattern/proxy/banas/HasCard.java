package com.wade.adam.pattern.proxy.banas;

public class HasCard implements ATMState{

    private ATMMachine atmMachine;

    public HasCard(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {

        System.out.println("You can't enter more than one card");

    }

    @Override
    public void ejectCard() {
        System.out.println("Card Ejected");
        atmMachine.setATMState(atmMachine.getNoCardState());
    }

    @Override
    public void insertPin(int pinEntered) {

        if(pinEntered == 1234){
            System.out.println("Correct PIN");
            atmMachine.setCorrectPinEntered(true);
            atmMachine.setATMState(atmMachine.getHasPinState());
        }
        else{
            System.out.println("Wrong PIN");
            atmMachine.setCorrectPinEntered(false);
            System.out.println("Card Ejected");
            atmMachine.setATMState(atmMachine.getNoCardState());
        }

    }

    @Override
    public void requestCash(int cashToWithdraw) {

        System.out.println("Enter PIN First");

    }
}
