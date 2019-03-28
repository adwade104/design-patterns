package com.wade.adam.pattern.adapter.wiki;

public class iPhone implements LightningPhone {

    private boolean connected;

    @Override
    public void recharge() {
        if(connected){
            System.out.println("Recharge started");
            System.out.println("Recharge finished");
        }
        else{
            System.out.println("Connect Lightning first");
        }
    }

    @Override
    public void useLightning() {
        connected = true;
        System.out.println("Lightning connected");
    }

}
