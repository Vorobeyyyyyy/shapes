package com.vorobyev.shape.repository;

import com.vorobyev.shape.entity.Pyramid;
import com.vorobyev.shape.observer.impl.PyramidObserver;

import java.util.List;

public class PyramidRepositoryInitializer {
    private static final PyramidRepository pyramidRepository = PyramidRepository.getInstance();

    public static void initialize(List<Pyramid> list) {
        for (Pyramid pyramid : list) {
            pyramid.attach(PyramidObserver.getInstance());
            pyramidRepository.add(pyramid);
            pyramid.notifyObservers();
        }
    }
}
