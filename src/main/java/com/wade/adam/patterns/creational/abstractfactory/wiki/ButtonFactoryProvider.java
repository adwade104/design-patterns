package com.wade.adam.patterns.creational.abstractfactory.wiki;

public class ButtonFactoryProvider {

    public static ButtonFactory getButtonFactory(String osType){

        if("WIN".equalsIgnoreCase(osType)){
            return new WinButtonButtonFactory();
        }
        else if("OSX".equalsIgnoreCase(osType)){
            return new OSXButtonButtonFactory();
        }

        return null;
    }

}
