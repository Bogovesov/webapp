package com.alevel.webapp;

public class Converter {
    public static int[] toIntArray(String[] strings){
        int[] numbers = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            numbers[i] = Integer.parseInt(strings[i]);
        }
        return numbers;
    }
}
