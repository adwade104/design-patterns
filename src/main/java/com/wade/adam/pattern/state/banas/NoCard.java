package com.wade.adam.pattern.state.banas;

public class NoCard implements ATMState {

    private ATMMachine atmMachine;

    public NoCard(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Please Enter a PIN");
        atmMachine.setATMState(atmMachine.getHasCardState());
    }

    @Override
    public void ejectCard() {
        System.out.println("Enter a Card First");
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("Enter a Card First");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("Enter a Card First");
    }

}
