package com.example.jeromesaltmarsh.domain.events.finishable;

import com.example.jeromesaltmarsh.domain.FinishableEvent;
import com.example.jeromesaltmarsh.domain.FinishableEventFinished;

public class Wait extends FinishableEventFinished {

    public int frames;

    public Wait(int _frames){
        frames = _frames;

        this.finishableEvent = new FinishableEvent() {
            @Override
            public void doHappen() {
                frames--;
                System.out.print("waiting" + frames);
            }

            @Override
            public boolean isFinished() {
                return frames <= 0;
            }
        };
    }
}
