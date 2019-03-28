package com.wade.adam.pattern.adapter.wiki;

public class Driver {

    public static void main(String[] args){

        System.out.println("Recharging android with MicroUsb");

        Android android = new Android();
        android.useMicroUsb();
        android.recharge();

        System.out.println("\nRecharging iPhone with Lightning");

        iPhone iPhone = new iPhone();
        iPhone.useLightning();
        iPhone.recharge();

        System.out.println("\nRecharging iPhone with MicroUsb");

        MicroUsbPhone microUsbPhone = new LightningToMicroUsbAdapter(iPhone);
        microUsbPhone.useMicroUsb();
        microUsbPhone.recharge();

    }

}
