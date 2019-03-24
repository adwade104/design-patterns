package com.wade.adam.pattern.singleton.tp;

public class Driver {

    public static void main(String[] args){

        SingleObject object = SingleObject.getInstance();
        object.showMessage();

    }

}
