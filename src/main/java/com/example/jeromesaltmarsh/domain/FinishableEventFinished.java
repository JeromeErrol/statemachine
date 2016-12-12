package com.example.jeromesaltmarsh.domain;

public class FinishableEventFinished extends Conditional {

    public FinishableEvent finishableEvent;

    @Override
    public boolean isMet() {
        return finishableEvent.isFinished();
    }
}
