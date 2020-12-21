package com.vorobyev.shape.reader;

import com.vorobyev.shape.exception.ReaderException;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class FileReaderTest {
    @Test
    public void testRead() {
        List<String> expected = new ArrayList<>();
        List<String> actual;
        expected.add("-1;-2;-1;-1;3;-1;3;3;-1;3;-2;-1;1;1;6");
        FileReader reader = new FileReader();
        try {
            actual = reader.read("res/testData.txt");
        } catch (ReaderException ignored) {
            actual = new ArrayList<>();
        }
        assertEquals(actual, expected);
    }
}