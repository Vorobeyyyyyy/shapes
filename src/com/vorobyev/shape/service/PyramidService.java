package com.vorobyev.shape.service;

import com.vorobyev.shape.entity.Point3D;
import com.vorobyev.shape.entity.Pyramid;

import java.util.List;

public class PyramidService {
    private static final int FIRST_BASE_POINT = 0;
    private static final int SECOND_BASE_POINT = 1;
    private static final int THIRD_BASE_POINT = 2;
    private static final int FOURTH_BASE_POINT = 3;

    public boolean isIntersectPlane(Pyramid pyramid) {
        float baseZ = pyramid.getBasePoints().get(0).getZ();
        float vertexZ = pyramid.getVertex().getZ();
        return (baseZ < 0 && vertexZ > 0 || baseZ > 0 && vertexZ < 0);
    }

    public double calculateVolume(Pyramid pyramid) {
        List<Point3D> basePoints = pyramid.getBasePoints();
        float baseZ = basePoints.get(0).getZ();
        float vertexZ = pyramid.getVertex().getZ();
        float height = Math.abs(baseZ - vertexZ);
        float length = basePoints.get(SECOND_BASE_POINT).getY() - basePoints.get(FIRST_BASE_POINT).getY();
        float width = basePoints.get(THIRD_BASE_POINT).getX() - basePoints.get(SECOND_BASE_POINT).getX();
        return (width * length * height / 3);
    }

    public double calculateArea(Pyramid pyramid) {
        List<Point3D> basePoints = pyramid.getBasePoints();
        float length = basePoints.get(SECOND_BASE_POINT).getY() - basePoints.get(FIRST_BASE_POINT).getY();
        float width = basePoints.get(THIRD_BASE_POINT).getX() - basePoints.get(SECOND_BASE_POINT).getX();
        return (length * width);
    }
}
