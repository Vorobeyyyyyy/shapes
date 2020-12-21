package com.vorobyev.shape.factory;

import com.vorobyev.shape.entity.Point3D;
import com.vorobyev.shape.entity.Pyramid;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.*;

public class ShapeFactoryTest {
    ShapeFactory factory = new ShapeFactory();

    @Test
    public void testCreatePyramidFromPoints() {
        List<Point3D> points = new ArrayList(Arrays.asList(new Point3D(-1f, -2f, -1f), new Point3D(-1f, 3f, -1f), new Point3D(3f, 3f, -1f), new Point3D(3f, -2f, -1f), new Point3D(1f, 1f, 6f)));
        Pyramid actual = factory.createPyramidFromPoints(points).get();
        Pyramid expected = new Pyramid(points.subList(0,4), points.get(4));
        assertEquals(actual, expected);
    }
}