package com.jalasoft.coding.xavier;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Library test class.
 */
public class FrequentItemCountTest {
    /**
     * Verify some library method.
     */
    @Test
    public void testSomeLibraryMethod() {
        final int[] frequentItemArray={3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3};
        int actualValue=FrequentItemCount.mostFrequentItemCount(frequentItemArray);
        final int expectedValue=5;
        Assert.assertEquals(actualValue, expectedValue);
    }
}
