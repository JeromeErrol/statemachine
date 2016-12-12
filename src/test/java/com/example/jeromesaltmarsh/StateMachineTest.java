package com.example.jeromesaltmarsh;

import com.example.jeromesaltmarsh.domain.*;
import com.example.jeromesaltmarsh.domain.events.finishable.Wait;
import com.example.jeromesaltmarsh.domain.events.finishable.Write;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class StateMachineTest {

    StateMachine stateMachine;
    State state01;
    State state02;

    FinishableEventFinished Wait;

    @Before
    public void before(){
        stateMachine = new StateMachine();
        state01 = new State();
        stateMachine.state = state01;
        state02 = new State();

        Wait wait = new Wait(3);
        Write write = new Write("hello");

        state01.orderedEvents.add(wait);
        state01.orderedEvents.add(write);

        Transition transition = new Transition(new StateFinished(state01), state02);
        state01.transitions.add(transition);

        Write write02 = new Write("world");
        state02.orderedEvents.add(write02);
    }

    @Test
    public void test(){
        stateMachine.update();
        assertFalse(true);
    }
}
