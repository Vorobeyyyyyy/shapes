package com.vorobyev.shape.util;

public class IdGenerator {
    private static long id;

    public static long getId() {
        return id++;
    }
}