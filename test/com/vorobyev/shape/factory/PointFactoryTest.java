package com.vorobyev.shape.factory;

import com.vorobyev.shape.entity.Point3D;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.*;

public class PointFactoryTest {
    PointFactory factory = new PointFactory();

    @Test
    public void testPointsFromFloats() {

        List<Float> floats = new ArrayList(Arrays.asList(-1f, -2f, -1f, -1f, 3f, -1f, 3f, 3f, -1f, 3f, -2f, -1f, 1f, 1f, 6f));
        List<Point3D> actual = factory.pointsFromFloats(floats);
        List<Point3D> expected = new ArrayList(Arrays.asList(new Point3D(-1f, -2f, -1f), new Point3D(-1f, 3f, -1f), new Point3D(3f, 3f, -1f), new Point3D(3f, -2f, -1f), new Point3D(1f, 1f, 6f)));
        assertEquals(actual, expected);
    }
}