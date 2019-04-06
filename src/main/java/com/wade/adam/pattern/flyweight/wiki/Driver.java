package com.wade.adam.pattern.flyweight.wiki;

import java.awt.*;
import java.util.EnumSet;

public class Driver {

    public static void main(String[] args){

        System.out.println("Executing Default Example");
        long defaultTime = executeDefaultExample(100000);
        System.out.println(String.format("Default Example Took %s ms", defaultTime));

        System.out.println("Starting Flyweight Example");
        long flyweightTime = executeFlyweightExample(100000);
        System.out.println(String.format("Flyweight Example Took %s ms", flyweightTime));

    }

    private static long executeDefaultExample(long numFontData){

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < numFontData; i++) {
            new FontData(10, "default", Color.red, EnumSet.of(FontEffect.SUBSCRIPT));
        }

        long endTime = System.currentTimeMillis();

        return (endTime - startTime);

    }

    private static long executeFlyweightExample(long numFontData){

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < numFontData; i++) {
            FontData.create(10, "default", Color.red, FontEffect.SUBSCRIPT);
        }

        long endTime = System.currentTimeMillis();

        return (endTime - startTime);

    }

}
