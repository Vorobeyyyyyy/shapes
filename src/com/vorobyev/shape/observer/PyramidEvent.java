package com.vorobyev.shape.observer;

import com.vorobyev.shape.entity.Pyramid;

import java.util.EventObject;

public class PyramidEvent extends EventObject {
    public PyramidEvent(Pyramid source) {
        super(source);
    }

    @Override
    public Pyramid getSource() {
        return (Pyramid) super.getSource();
    }
}
