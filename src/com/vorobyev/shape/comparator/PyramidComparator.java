package com.vorobyev.shape.comparator;

import com.vorobyev.shape.entity.Pyramid;

import java.util.Comparator;

public enum  PyramidComparator implements Comparator<Pyramid> {
    VERTEX_Z(Comparator.comparing(o -> o.getVertex().getZ())),
    HEIGHT(Comparator.comparing(o -> Math.abs(o.getVertex().getZ() - o.getBasePoints().get(0).getZ())));


    private Comparator<Pyramid> comparator;

    PyramidComparator(Comparator<Pyramid> comparator) {
        this.comparator = comparator;
    }

    @Override
    public int compare(Pyramid o1, Pyramid o2) {
        return comparator.compare(o1, o2);
    }
}
