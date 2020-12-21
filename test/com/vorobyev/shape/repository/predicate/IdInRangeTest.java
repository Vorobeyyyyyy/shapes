package com.vorobyev.shape.repository.predicate;

import com.vorobyev.shape.entity.Pyramid;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IdInRangeTest {
    @Test
    public void testTest1() {
        IdInRange predicate = new IdInRange(3, 5);
        Pyramid pyramid = new Pyramid();
        assertFalse(predicate.test(pyramid));
    }

    @Test
    public void testTest2() {
        Pyramid pyramid = new Pyramid();
        long id = pyramid.getId();
        IdInRange predicate = new IdInRange(id, id);
        assertTrue(predicate.test(pyramid));
    }
}