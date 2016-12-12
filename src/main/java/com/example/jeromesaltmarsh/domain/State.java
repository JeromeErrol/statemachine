package com.example.jeromesaltmarsh.domain;

import java.util.ArrayList;
import java.util.List;

public class State extends MonoBehavior implements IsFinishable{

    public List<Transition> transitions = new ArrayList<>();
    public List<Event> startEvents = new ArrayList<>();
    public List<Event> parallelEvents = new ArrayList<>();
    public List<FinishableEventFinished> orderedEvents = new ArrayList<>();
    public List<Event> endEvents = new ArrayList<>();

    private int index = 0;
    private boolean finished = false;

    public void process(On on) {
        if (on == On.UPDATE) {
            parallelEvents.forEach(event -> event.happen());

            if (!orderedEvents.isEmpty() && index < orderedEvents.size()) {
                FinishableEventFinished finishableEventFinished = orderedEvents.get(index);
                if (finishableEventFinished.finishableEvent.isFinished()) {
                    index++;
                    finished = index < orderedEvents.size();

                } else {
                    finishableEventFinished.finishableEvent.happen();
                }
            }
        }
    }

    @Override
    public boolean isFinished() {
        return finished;
    }
}
