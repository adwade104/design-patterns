package com.wade.adam.pattern.state.wiki;

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
