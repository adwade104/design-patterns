package com.wade.adam.patterns.creational.singleton.tp;

public class Driver {

    public static void main(String[] args){

        SingleObject object = SingleObject.getInstance();
        object.showMessage();

    }

}
