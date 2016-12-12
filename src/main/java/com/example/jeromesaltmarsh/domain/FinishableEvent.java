package com.example.jeromesaltmarsh.domain;

public abstract class FinishableEvent extends Event implements IsFinishable {

    @Override
    public final void happen() {
        if (!isFinished()) {
            doHappen();
        }
    }

    protected abstract void doHappen();
}
