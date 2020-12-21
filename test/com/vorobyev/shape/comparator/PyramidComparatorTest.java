package com.vorobyev.shape.comparator;

import com.vorobyev.shape.entity.Point3D;
import com.vorobyev.shape.entity.Pyramid;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PyramidComparatorTest {
    Pyramid pyramid1 = new Pyramid();
    Pyramid pyramid2 = new Pyramid();

    @BeforeTest
    public void beforeTest() {
        pyramid2.setVertex(new Point3D(0,0,5));
    }

    @Test
    public void testCompareVertexZ() {
        int actual = PyramidComparator.VERTEX_Z.compare(pyramid1, pyramid2);
        int expected = -1;
        assertEquals(actual, expected);
    }

    @Test
    public void testCompareHeight() {
        int actual = PyramidComparator.VERTEX_Z.compare(pyramid2, pyramid1);
        int expected = 1;
        assertEquals(actual, expected);
    }
}