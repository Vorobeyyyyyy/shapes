package com.vorobyev.shape.validator;

import com.vorobyev.shape.entity.Point3D;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PyramidValidator {
    private static final String PYRAMID_DATA_REGEX = "-?\\d\\.?\\d?(;-?\\d\\.?\\d?){14}";

    private static final int BASE_FIRST_POINT = 0;
    private static final int BASE_SECOND_POINT = 1;
    private static final int BASE_THIRD_POINT = 2;
    private static final int BASE_FOURTH_POINT = 3;

    public static boolean isPyramidDataValid(String stringData) {
        Pattern pattern = Pattern.compile(PYRAMID_DATA_REGEX);
        Matcher matcher = pattern.matcher(stringData);
        return matcher.matches();
    }

    public static boolean isPyramidBasePointsValid(List<Point3D> points) {
        Point3D firstPoint = points.get(BASE_FIRST_POINT);
        Point3D secondPoint = points.get(BASE_SECOND_POINT);
        Point3D thirdPoint = points.get(BASE_THIRD_POINT);
        Point3D fourthPoint = points.get(BASE_FOURTH_POINT);
        boolean baseParallel = firstPoint.getZ() == secondPoint.getZ() &&
                secondPoint.getZ() == thirdPoint.getZ() &&
                thirdPoint.getZ() == fourthPoint.getZ();
        boolean baseRectangle = firstPoint.getX() == firstPoint.getX() &&
                secondPoint.getY() == thirdPoint.getY() &&
                thirdPoint.getX() == fourthPoint.getX() &&
                fourthPoint.getY() == firstPoint.getY();

        return (baseParallel && baseRectangle);
    }
}
