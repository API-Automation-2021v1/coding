package Weimar;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Library test class.
 */
public class FrequentItemTest {

    /**
     * Verify some library method.
     */
    @Test
    public void tests() {
        final int[] frequentItemArray1 = {3, -1, -1};
        final int[] frequentItemArray2 = {3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3};
        final int expectedResult1 = 2;
        final int expectedResult2 = 5;
        int actualvalue1 = FrequentItem.mostFrequentItemCount(frequentItemArray1);
        int actualvalue2 = FrequentItem.mostFrequentItemCount(frequentItemArray2);
        Assert.assertEquals(actualvalue1, expectedResult1);
        Assert.assertEquals(actualvalue1, expectedResult1);
    }
}
