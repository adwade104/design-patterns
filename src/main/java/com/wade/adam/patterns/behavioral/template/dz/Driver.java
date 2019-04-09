package com.wade.adam.patterns.behavioral.template.dz;

public class Driver {

    public static void main(String[] args){
        CrossCompiler iphone = new IPhoneCompiler();
        iphone.crossCompile();
        CrossCompiler android = new AndroidCompiler();
        android.crossCompile();
    }


}
