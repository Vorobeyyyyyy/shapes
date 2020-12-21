package com.vorobyev.shape.observer.impl;

import com.vorobyev.shape.entity.Point3D;
import com.vorobyev.shape.entity.Pyramid;
import com.vorobyev.shape.entity.PyramidProperty;
import com.vorobyev.shape.observer.PyramidEvent;
import com.vorobyev.shape.warehouse.PyramidPropertyWarehouse;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PyramidObserverTest {
    PyramidObserver observer = PyramidObserver.getInstance();
    PyramidPropertyWarehouse propertyWarehouse = PyramidPropertyWarehouse.getInstance();

    @Test
    public void testHandleEvent() {
        Pyramid pyramid = new Pyramid();
        pyramid.attach(observer);
        pyramid.setVertex(new Point3D(5, 5, 5));
        PyramidProperty actual = propertyWarehouse.get(pyramid.getId());
        PyramidProperty expected = new PyramidProperty(5d / 3d, 1f, false);
        assertEquals(actual, expected);
    }
}