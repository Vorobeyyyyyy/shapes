package com.vorobyev.shape.repository;

import com.vorobyev.shape.entity.Pyramid;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PyramidRepository {
    private static final PyramidRepository instance = new PyramidRepository();

    private final List<Pyramid> pyramidList = new ArrayList<>();

    public static PyramidRepository getInstance() {
        return instance;
    }

    public boolean add(Pyramid pyramid) {
        return pyramidList.add(pyramid);
    }

    public Pyramid get(int index) {
        return pyramidList.get(index);
    }

    public Pyramid set(int index, Pyramid element) {
        return pyramidList.set(index, element);
    }

    public boolean remove(Object o) {
        return pyramidList.remove(o);
    }


    public List<Pyramid> find(Predicate<Pyramid> predicate, Comparator<Pyramid> comparator) {
        List<Pyramid> result = find(predicate);
        result.sort(comparator);
        return result;
    }

    public List<Pyramid> find(Predicate<Pyramid> predicate) {
        return pyramidList.stream().filter(predicate).collect(Collectors.toList());
    }

    public void sort(Comparator<Pyramid> comparator) {
        pyramidList.sort(comparator);
    }

}
