package com.wade.adam.patterns.behavioral.observer.banas;

public class Driver {


    public static void main(String[] args){

        StockGrabber stockGrabber = new StockGrabber();

        StockObserver observerOne = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(197.00);
        stockGrabber.setAaplPrice(677.60);
        stockGrabber.setGoogPrice(676.40);

        StockObserver observerTwo = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(197.00);
        stockGrabber.setAaplPrice(677.60);
        stockGrabber.setGoogPrice(676.40);

        stockGrabber.unregister(observerOne);

        System.out.println("Observer One unregistered");

        stockGrabber.setIbmPrice(197.00);
        stockGrabber.setAaplPrice(677.60);
        stockGrabber.setGoogPrice(676.40);

    }


}
