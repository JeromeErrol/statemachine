package com.example.jeromesaltmarsh.domain;

public class Transition extends MonoBehavior {
    public Conditional conditional;
    public State state;


    public Transition(Conditional conditional, State state) {
        this.conditional = conditional;
        this.state = state;
    }
}
