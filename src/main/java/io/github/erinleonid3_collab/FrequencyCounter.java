package io.github.erinleonid3_collab;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    public static <T> Map<T, Integer> countOccurrences(T[] arr) {
        if (arr == null) {
            throw new NullPointerException("array must not be null");
        }
        Map<T, Integer> mapForCount = new HashMap<>();
        for (T t : arr) {
            mapForCount.put(t, mapForCount.getOrDefault(t, 0) + 1);
        }
        return mapForCount;
    }
}
