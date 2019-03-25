package com.wade.adam.pattern.command.banas;

public class TVRemote {

    public static ElectronicDevice getDevice(){
        return new Television();
    }

}
