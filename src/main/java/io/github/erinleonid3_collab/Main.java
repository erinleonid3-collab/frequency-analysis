package io.github.erinleonid3_collab;


public class Main {
    public static void main(String[] args) {
        String[] array = new String[]{"a", "b", "a", "c", "d", "a", "b"};
        System.out.println(FrequencyCounter.countOccurrences(array));

        Integer[] integerArray = {1, 2, 1, 2, 3, 4, 1};
        System.out.println("Другой тип:");
        System.out.println(FrequencyCounter.countOccurrences(integerArray));
    }
}