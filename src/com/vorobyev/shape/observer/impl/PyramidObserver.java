package com.vorobyev.shape.observer.impl;

import com.vorobyev.shape.entity.Pyramid;
import com.vorobyev.shape.entity.PyramidProperty;
import com.vorobyev.shape.observer.Observer;
import com.vorobyev.shape.observer.PyramidEvent;
import com.vorobyev.shape.service.PyramidService;
import com.vorobyev.shape.warehouse.PyramidPropertyWarehouse;

import java.util.EventObject;

public class PyramidObserver implements Observer {
    private final PyramidPropertyWarehouse propertyWarehouse = PyramidPropertyWarehouse.getInstance();

    private static final PyramidObserver instance = new PyramidObserver();

    public static PyramidObserver getInstance() {
        return instance;
    }

    @Override
    public void handleEvent(EventObject event) {
        PyramidEvent pyramidEvent = (PyramidEvent) event;
        Pyramid pyramid = pyramidEvent.getSource();
        long id = pyramid.getId();
        PyramidProperty property;
        if (!propertyWarehouse.containsKey(id)) {
            property = new PyramidProperty();
            propertyWarehouse.put(id, property);
        } else {
            property = propertyWarehouse.get(id);
        }
        PyramidService service = new PyramidService();
        property.setVolume(service.calculateVolume(pyramid));
        property.setIntersectPlane(service.isIntersectPlane(pyramid));
        property.setArea(service.calculateArea(pyramid));
    }
}
