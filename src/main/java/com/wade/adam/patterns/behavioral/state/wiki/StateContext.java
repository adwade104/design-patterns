package com.wade.adam.patterns.behavioral.state.wiki;

class StateContext {
    private State state;

    public StateContext() {
        state = new LowerCaseState();
    }

    void setState(State newState) {
        state = newState;
    }

    public void writeName(String name) {
        state.writeName(this, name);
    }
}
