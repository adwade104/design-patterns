package com.wade.adam.pattern.state.wiki;

public interface State {
    void writeName(StateContext context, String name);
}
