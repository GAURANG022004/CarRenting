package util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import exception.InvalidInputException;

public class DateUtil {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyyMMdd");

    public static int parseDateToInt(String dateStr) {
        try {
            LocalDate date = LocalDate.parse(dateStr, FORMATTER);
            return Integer.parseInt(date.format(FORMATTER));
        } catch (DateTimeParseException e) {
            throw new InvalidInputException("Invalid date format. Use yyyyMMdd.");
        }
    }

    public static int calculateDaysBetween(int startDateInt, int endDateInt) {
        LocalDate start = LocalDate.parse(String.valueOf(startDateInt), FORMATTER);
        LocalDate end = LocalDate.parse(String.valueOf(endDateInt), FORMATTER);
        return (int) (end.toEpochDay() - start.toEpochDay());
    }
}

