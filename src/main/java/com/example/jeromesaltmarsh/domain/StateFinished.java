package com.example.jeromesaltmarsh.domain;

public class StateFinished extends Conditional {

    public State state;

    @Override
    public boolean isMet() {
        return state.isFinished();
    }

    public StateFinished(State state) {
        this.state = state;
    }
}
