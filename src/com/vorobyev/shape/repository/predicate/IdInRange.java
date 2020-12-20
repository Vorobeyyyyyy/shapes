package com.vorobyev.shape.repository.predicate;

import com.vorobyev.shape.entity.Pyramid;

import java.util.function.Predicate;

public class IdInRange implements Predicate<Pyramid> {
    private final long from;
    private final long to;

    public IdInRange(long from, long to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean test(Pyramid pyramid) {
        long id = pyramid.getId();
        return (id >= from && id <= to);
    }


}