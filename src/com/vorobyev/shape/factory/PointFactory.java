package com.vorobyev.shape.factory;

import com.vorobyev.shape.entity.Point3D;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PointFactory {
    private static final Logger logger = LogManager.getLogger();

    private static final int VALUES_CORRECT_SIZE = 3;
    private static final int FIRST_VALUE = 0;
    private static final int SECOND_VALUE = 1;
    private static final int THIRD_VALUE = 2;

    public Optional<Point3D> pointFromFloats(List<Float> values) {
        if (values.size() != VALUES_CORRECT_SIZE) {
            return Optional.empty();
        }
        Point3D point3D = new Point3D(values.get(FIRST_VALUE), values.get(SECOND_VALUE), values.get(THIRD_VALUE));
        return Optional.of(point3D);
    }

    public List<Point3D> pointsFromFloats(List<Float> values) {
        List<Point3D> result = new ArrayList<>();
        if (values.size() % VALUES_CORRECT_SIZE != 0) {
            logger.log(Level.WARN, "Floats count ({}) is not multiple of {}. Some values will be skipped", values.size(), VALUES_CORRECT_SIZE);
        }
        for (int i = 0; i <= values.size() - VALUES_CORRECT_SIZE; i += VALUES_CORRECT_SIZE) {
            Point3D point3D = new Point3D(values.get(i + FIRST_VALUE), values.get(i + SECOND_VALUE), values.get(i + THIRD_VALUE));
            result.add(point3D);
        }
        return result;
    }
}
