package com.jalasoft.coding.milena;

import java.util.HashMap;
import java.util.Map;
import java.util.OptionalInt;

/**
 * This find the most frequent number given a collection of integer.
 */
public class MostFrequentFinder {
    /**
     * Constructor if the main class.
     */
    public MostFrequentFinder() {
    }

    /**
     * Class the find the most frequent number in the collection.
     * @param input is the collection of numbers.
     * @return the most frequent number in the collection.
     */
    public int findMostFrequentItem(final int[] input) {
        if (input.length == 0) {
            return 0;

        }
        Map<Integer, Integer> counters = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            int item = input[i];
            if (counters.containsKey(item)) {
                int frequency = counters.get(item);
                frequency++;
                counters.put(item, frequency);

            } else {
                counters.put(item, 1);

            }

        }
        OptionalInt maxNumber = counters.values().stream().mapToInt(i -> i).max();
        for (var entry : counters.entrySet()) {
            if (entry.getValue() == maxNumber.getAsInt()) {
                return entry.getKey();
            }

        }
        return 0;


    }
}
