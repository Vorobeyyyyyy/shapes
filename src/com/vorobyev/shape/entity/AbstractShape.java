package com.vorobyev.shape.entity;

import com.vorobyev.shape.util.IdGenerator;

public abstract class AbstractShape {
    private final long id;

    protected AbstractShape() {
        id = IdGenerator.getId();
    }

    public long getId() {
        return id;
    }
}
