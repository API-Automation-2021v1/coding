package com.jalasoft.coding.naira;

import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Unitests
 */
public class MostFrequencyItemTest {

    /**
     * When The array is empty returns zero
     */
    @Test
    public void emptyArray() {
        int [] numbers =  {};
        int actual = MostFrequencyItem.frequencyItem(numbers);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    /**
     * When the elements on they array are uniques.None of them is repeated
     */
    @Test
    public void noRepeatedItem() {
        int [] numbers =  {-1,-2,-3, 3, 4};
        int actual = MostFrequencyItem.frequencyItem(numbers);
        int expected = 1;

        Assert.assertEquals(actual, expected);
    }
    /**
     *When there are a elements that it repeated
     */
    @Test
    public void MaxFrequencyItem() {
        int [] numbers =  {3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3};
        int actual = MostFrequencyItem.frequencyItem(numbers);
        int expected = 5;

        Assert.assertEquals(actual, expected);
    }
    /**
     *When there are two elements that have the same frecuency
     *  */
    @Test
    public void MaxFrequencyIsDuplicated() {
        int [] numbers =  {2, 3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 2, 2, 9};
        int actual = MostFrequencyItem.frequencyItem(numbers);
        int expected = 5;

        Assert.assertEquals(actual, expected);
    }
}
