package com.vorobyev.shape.observer;

import java.util.EventObject;

public interface Observer {
    void handleEvent(EventObject eventObject);
}
