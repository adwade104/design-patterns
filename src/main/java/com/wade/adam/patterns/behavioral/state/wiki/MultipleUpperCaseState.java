package com.wade.adam.patterns.behavioral.state.wiki;

public class MultipleUpperCaseState implements State {

    private int count = 0;

    @Override
    public void writeName(StateContext context, String name) {
        System.out.println(name.toUpperCase());

        if(++count > 1) {
            context.setState(new LowerCaseState());
        }
    }
}
