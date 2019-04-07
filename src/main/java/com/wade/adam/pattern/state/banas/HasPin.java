package com.wade.adam.pattern.state.banas;

public class HasPin implements ATMState {

    private ATMMachine atmMachine;

    public HasPin(ATMMachine atmMachine) {
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
        System.out.println("Already Entered PIN");
    }

    @Override
    public void requestCash(int cashToWithdraw) {

        if(cashToWithdraw > atmMachine.getCashInMachine()){
            System.out.println("Dont Have That Cash");
            System.out.println("Card Ejected");
            atmMachine.setATMState(atmMachine.getNoCardState());
        }
        else {
            System.out.println(cashToWithdraw + " Is Provided By The Machine");
            atmMachine.setCashInMachine(atmMachine.getCashInMachine() - cashToWithdraw);
            System.out.println("Card Ejected");
            atmMachine.setATMState(atmMachine.getNoCardState());

            if (atmMachine.getCashInMachine() <= 0){
                atmMachine.setATMState(atmMachine.getNoCashState());
            }
        }

    }
}
