package com.vorobyev.shape.parser;

import com.vorobyev.shape.validator.PyramidValidator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class PyramidCoordinatesParser {
    private static final Logger logger = LogManager.getLogger();

    private static final String DELIMITER = ";";

    public List<Float> parseString(String dataString) {
        if (!PyramidValidator.isPyramidDataValid(dataString)) {
            logger.log(Level.ERROR, "Data ({}) is invalid", dataString);
        }
        List<Float> result = new ArrayList<>();
        String[] parts = dataString.split(DELIMITER);
        for (String stringFloat : parts) {
            try {
                Float floatValue = Float.parseFloat(stringFloat);
                result.add(floatValue);
            } catch (NumberFormatException exception) {
                logger.log(Level.ERROR, "Error parsing ({}) - ({})", stringFloat, exception.getMessage());
            }
        }
        return result;
    }
}
