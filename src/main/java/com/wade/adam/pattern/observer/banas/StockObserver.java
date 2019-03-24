package com.wade.adam.pattern.observer.banas;

public class StockObserver implements Observer {

    private static int observerIdTracker = 0;
    private int observerId;

    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    public StockObserver(Subject stockGrabber) {

        this.observerId = ++observerIdTracker;
        System.out.println("New Observer: " + this.observerId);

        stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;
        this.googPrice = googPrice;

        printPrices();
    }

    private void printPrices(){

        System.out.println(observerId + "\nIBM: " + ibmPrice + "\nAAPL: " +
                aaplPrice + "\nGOOG: " + googPrice + "\n");

    }



}
