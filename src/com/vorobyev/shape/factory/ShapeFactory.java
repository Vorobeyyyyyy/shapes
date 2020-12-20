package com.vorobyev.shape.factory;

import com.vorobyev.shape.entity.AbstractShape;
import com.vorobyev.shape.entity.Point3D;
import com.vorobyev.shape.entity.Pyramid;
import com.vorobyev.shape.validator.PyramidValidator;

import java.util.List;
import java.util.Optional;

public class ShapeFactory {
    private static final int BASE_START_INDEX = 0;
    private static final int BASE_EDN_INDEX = 3;
    private static final int VERTEX_INDEX = 3;
    private static final int POINTS_CORRECT_COUNT = 5;

    public Optional<Pyramid> createPyramidFromPoints(List<Point3D> points) {
        if (points == null || points.size() != POINTS_CORRECT_COUNT) {
            return Optional.empty();
        }
        List<Point3D> basePoints = points.subList(BASE_START_INDEX, BASE_EDN_INDEX);
        if (!PyramidValidator.isPyramidBasePointsValid(basePoints)) {
            return Optional.empty();
        }
        Point3D vertex = points.get(VERTEX_INDEX);
        Pyramid pyramid = new Pyramid(basePoints, vertex);
        return Optional.of(pyramid);
    }
}
