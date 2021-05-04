package com.jalasoft.coding.milena.Most;

import com.jalasoft.coding.milena.MostFrequentFinder;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FrequentFinderTests {
    /**
     * This is the constant for a array of integers.
     */
    private static final int[] INPUT = new int[]{1, 5, 0, 8, 8, 7};
    /**
     * this is a constant for a expected result.
     */
    private static final int EXPECTED = 8;
    /**
     * This test verify that the most frequent item for collection is returned.
     */
    @Test

    public void shouldFindMostFrequentNumber() {

        var finder = new MostFrequentFinder();
        int result = finder.findMostFrequentItem(INPUT);

        assertEquals(EXPECTED, result);

    }

}
