package com.vorobyev.shape.repository.predicate;

import com.vorobyev.shape.entity.Pyramid;

import java.util.function.Predicate;

public class HeightInRange implements Predicate<Pyramid> {
    private final float from;
    private final float to;

    public HeightInRange(float from, float to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean test(Pyramid pyramid) {
        float baseZ = pyramid.getBasePoints().get(0).getZ();
        float vertexZ = pyramid.getVertex().getZ();
        float height = Math.abs(baseZ - vertexZ);
        return (height >= from && height <= to);
    }


}
