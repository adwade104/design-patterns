package com.wade.adam.patterns.structural.proxy.banas;

public class Driver {

    public static void main(String[] args){

        GetATMData realATMMachine = new ATMMachine();

        GetATMData atmProxy = new ATMProxy();

        System.out.println("\nCurrent ATM State " + atmProxy.getATMState());
        System.out.println("\nCash in ATM Machine $" + atmProxy.getCashInMachine());

    }

}
