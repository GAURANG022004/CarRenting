package util;

import exception.InvalidInputException;

public class InputValidator {

    public static int requirePositiveInt(int value, String fieldName) {
        if (value <= 0) {
            throw new InvalidInputException(fieldName + " must be positive.");
        }
        return value;
    }

    public static String requireNonEmpty(String value, String fieldName) {
        if (value == null || value.trim().isEmpty()) {
            throw new InvalidInputException(fieldName + " must not be empty.");
        }
        return value.trim();
    }
}

