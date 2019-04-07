package com.wade.adam.pattern.proxy.banas;

public class ATMProxy implements GetATMData {

    @Override
    public ATMState getATMState() {
        ATMMachine realATMMachine = new ATMMachine();
        return realATMMachine.getATMState();
    }

    @Override
    public int getCashInMachine() {
        ATMMachine realATMMachine = new ATMMachine();
        return realATMMachine.getCashInMachine();
    }

}
