package com.wade.adam.patterns.structural.proxy.tp;

public class Driver {

    public static void main(String[] args){

        Image image = new ProxyImage("test_10mb.jpg");
        Image image2 = new ProxyImage("test_40mb.jpg");

        System.out.println("Loading necessary:");
        image.display();

        System.out.println("\nLoading unnecessary:");
        image.display();

        System.out.println("\nLoading necessary:");
        image2.display();

        System.out.println("\nLoading unnecessary:");
        image2.display();

        System.out.println("\nLoading unnecessary:");
        image.display();

    }

}
