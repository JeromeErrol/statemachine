package com.example.jeromesaltmarsh.domain.events.finishable;

import com.example.jeromesaltmarsh.domain.FinishableEvent;
import com.example.jeromesaltmarsh.domain.FinishableEventFinished;

public class Write extends FinishableEventFinished {

    public String value;


    public Write(String _value) {
        value = _value;
        this.finishableEvent = new FinishableEvent() {
            @Override
            public void doHappen() {
                System.out.println(value);
            }

            @Override
            public boolean isFinished() {
                // has text been written
                return false;
            }
        };
    }
}
