package com.vorobyev.shape.parser;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.*;

public class PyramidCoordinatesParserTest {

    @Test
    public void testParseString() {
        PyramidCoordinatesParser parser = new PyramidCoordinatesParser();
        List<Float> actual = parser.parseString("-1;-2;-1;-1;3;-1;3;3;-1;3;-2;-1;1;1;6");
        List<Float> expected = new ArrayList(Arrays.asList(-1f, -2f, -1f, -1f, 3f, -1f, 3f, 3f, -1f, 3f, -2f, -1f, 1f, 1f, 6f));
        assertEquals(actual, expected);
    }
}