package com.example.jeromesaltmarsh.domain;

import java.util.ArrayList;
import java.util.List;

public class MonoBehavior {

    public <T extends MonoBehavior> List<T> GetComponents() {
        return new ArrayList<T>();
    }
}
