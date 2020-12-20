package com.vorobyev.shape.entity;

import com.vorobyev.shape.observer.Observable;
import com.vorobyev.shape.observer.Observer;
import com.vorobyev.shape.observer.PyramidEvent;

import java.util.ArrayList;
import java.util.List;

public class Pyramid extends AbstractShape implements Observable {
    List<Point3D> basePoints;
    Point3D vertex;

    public Pyramid() {
        super();
        basePoints = new ArrayList<>();
        basePoints.add(new Point3D(0, 0, 0));
        basePoints.add(new Point3D(0, 1, 0));
        basePoints.add(new Point3D(1, 1, 0));
        basePoints.add(new Point3D(1, 0, 0));
        vertex = new Point3D(0, 0, 1);
    }

    public Pyramid(List<Point3D> basePoints, Point3D vertex) {
        this.basePoints = basePoints;
        this.vertex = vertex;
    }

    public List<Point3D> getBasePoints() {
        return basePoints;
    }

    public void setBasePoints(List<Point3D> basePoints) {
        this.basePoints = basePoints;
        notifyObservers();
    }

    public Point3D getVertex() {
        return vertex;
    }

    public void setVertex(Point3D vertex) {
        this.vertex = vertex;
        notifyObservers();
    }

    @Override
    public void attach(Observer observer) {
        if (observer == null || observers.contains(observer)) {
            return;
        }
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        PyramidEvent event = new PyramidEvent(this);
        observers.forEach(o -> o.handleEvent(event));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pyramid pyramid = (Pyramid) o;

        if (!basePoints.equals(pyramid.basePoints)) return false;
        return vertex.equals(pyramid.vertex);
    }

    @Override
    public int hashCode() {
        int result = basePoints.hashCode();
        result = 31 * result + vertex.hashCode();
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pyramid{");
        sb.append("basePoints=").append(basePoints);
        sb.append(", vertex=").append(vertex);
        sb.append('}');
        return sb.toString();
    }
}

