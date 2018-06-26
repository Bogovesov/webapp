package com.alevel.webapp;

public class Splitter {
    private static final String JSON_SEPARATOR = "=";
    private static final String COMMA_UTF8 = "%2C";

    public static String[] toStringArray(String inputString) {
        String[] value = inputString.split(JSON_SEPARATOR);
        value = value[1].split(COMMA_UTF8);
        return value;
    }
}
