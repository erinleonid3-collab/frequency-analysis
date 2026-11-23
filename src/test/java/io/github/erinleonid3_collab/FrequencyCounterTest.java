package io.github.erinleonid3_collab;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class FrequencyCounterTest {
    @Test
    void shouldhouldCountDuplicates() {
        String[] array = {"a", "b", "a", "c", "d", "a", "b"};
        Map<String, Integer> result = FrequencyCounter.countOccurrences(array);
        assertEquals(3, result.get("a"));
        assertEquals(2, result.get("b"));
        assertEquals(1, result.get("c"));
        assertEquals(1, result.get("d"));
        assertEquals(4, result.size());
    }

    @Test
    void shouldAllElementsUnique() {
        String[] array = {"a", "b", "c", "d"};
        Map<String, Integer> result = FrequencyCounter.countOccurrences(array);
        assertEquals(1, result.get("a"));
        assertEquals(1, result.get("b"));
        assertEquals(1, result.get("c"));
        assertEquals(1, result.get("d"));
        assertEquals(4, result.size());
    }

    @Test
    void shouldArrayIsEmpty() {
        String[] array = {};
        Map<String, Integer> result = FrequencyCounter.countOccurrences(array);
        Map<String, Integer> emptyMap = new HashMap<>();
        assertEquals(emptyMap, result);
    }

    @Test
    void shouldNullElementsInArray() {
        String[] array = {"a", null, null, null};
        Map<String, Integer> result = FrequencyCounter.countOccurrences(array);
        assertEquals(1, result.get("a"));
        assertEquals(3, result.get(null));
        assertEquals(2, result.size());  // "a" и null
    }

    @Test
    void shouldNullArray() {
        assertThrows(NullPointerException.class, () -> {
            FrequencyCounter.countOccurrences( (String[])null);
        });
    }

    @Test
    void shouldCountIntegers() {
        Integer[] input = {1, 1, 2, 3, 3, 3};
        Map<Integer, Integer> result = FrequencyCounter.countOccurrences(input);
        Map<Integer, Integer> expected = Map.of(1, 2, 2, 1, 3, 3);
        assertEquals(expected, result);
    }
}
