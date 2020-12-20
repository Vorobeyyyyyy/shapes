package com.vorobyev.shape.observer;

import java.util.ArrayList;
import java.util.List;

public interface Observable {
    List<Observer> observers = new ArrayList<>();

    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}
