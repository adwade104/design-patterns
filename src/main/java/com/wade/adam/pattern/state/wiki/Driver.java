package com.wade.adam.pattern.state.wiki;

public class Driver {

    public static void main(String[] args){

        StateContext context = new StateContext();

        context.writeName("Monday");
        context.writeName("Tuesday");
        context.writeName("Wednesday");
        context.writeName("Thursday");
        context.writeName("Friday");
        context.writeName("Saturday");
        context.writeName("Sunday");

    }


}
