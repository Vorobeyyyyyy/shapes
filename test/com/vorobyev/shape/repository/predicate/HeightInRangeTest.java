package com.vorobyev.shape.repository.predicate;

import com.vorobyev.shape.entity.Pyramid;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HeightInRangeTest {

    @Test
    public void testTest1() {
        HeightInRange predicate = new HeightInRange(3f,5f);
        Pyramid pyramid = new Pyramid();
        assertFalse(predicate.test(pyramid));
    }

    @Test
    public void testTest2() {
        HeightInRange predicate = new HeightInRange(1f,5f);
        Pyramid pyramid = new Pyramid();
        assertTrue(predicate.test(pyramid));
    }
}