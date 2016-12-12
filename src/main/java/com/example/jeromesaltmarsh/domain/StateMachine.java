package com.example.jeromesaltmarsh.domain;

public class StateMachine extends MonoBehavior {

    public State state;

    public void update(){
        for (Transition transition : state.transitions) {
            if (transition.state != state && transition.conditional.isMet()) {
                state.process(On.END);
                state = transition.state;
                state.process(On.START);
                // Log state change
                return;
            }
        }
        state.process(On.UPDATE);
    }

}
