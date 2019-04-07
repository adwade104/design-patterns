package com.wade.adam.pattern.proxy.banas;

public class ATMMachine implements GetATMData {

    private ATMState hasCard;
    private ATMState noCard;
    private ATMState hasCorrectPin;
    private ATMState atmOutOfMoney;

    private ATMState atmState;

    private int cashInMachine = 2000;
    private boolean correctPinEntered = false;

    public ATMMachine() {
        this.hasCard = new HasCard(this);
        this.noCard = new NoCard(this);
        this.hasCorrectPin = new HasPin(this);
        this.atmOutOfMoney = new NoCash(this);

        atmState = noCard;

        if(cashInMachine == 0){
            atmState = atmOutOfMoney;
        }
    }

    public void setATMState(ATMState atmState){
        this.atmState = atmState;
    }

    /*These are used for the proxy pattern,
      We are only going to expose these ones to the client
      Could be setup, for example, so that a branch manager could see if a machine has run out of cash etc
    */
    @Override
    public ATMState getATMState() {
        return atmState;
    }

    @Override
    public int getCashInMachine() {
        return cashInMachine;
    }
    //end

    public void setCashInMachine(int cashInMachine) {
        this.cashInMachine = cashInMachine;
    }

    public void setCorrectPinEntered(boolean correctPinEntered) {
        this.correctPinEntered = correctPinEntered;
    }

    public void insertCard(){
        atmState.insertCard();
    }

    public void ejectCard(){
        atmState.ejectCard();
    }

    public void requestCash(int cashToWithdraw){
        atmState.requestCash(cashToWithdraw);
    }

    public void insertPin(int pinEntered){
        atmState.insertPin(pinEntered);
    }

    public ATMState getHasCardState(){
        return hasCard;
    }

    public ATMState getNoCardState(){
        return noCard;
    }

    public ATMState getHasPinState(){
        return hasCorrectPin;
    }

    public ATMState getNoCashState(){
        return atmOutOfMoney;
    }

}
