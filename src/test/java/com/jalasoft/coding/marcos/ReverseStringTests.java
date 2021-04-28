package com.jalasoft.coding.marcos;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseStringTests {

    /**
     * Test to reverse single letter.
     */
    @Test
    public void reverseSingleLetterTest() {
        String input = "A";
        String actual = ReverseString.reverse(input);
        String expected = "A";
        Assert.assertEquals(actual, expected);
    }

    /**
     * Test to reverse two letters.
     */
    @Test
    public void reverseTwoLetterTest() {
        String input = "AB";
        String actual = ReverseString.reverse(input);
        String expected = "BA";
        Assert.assertEquals(actual, expected);
    }

    /**
     * Test to reverse empty string.
     */
    @Test
    public void reverseEmptyStringTest() {
        String input = "";
        String actual = ReverseString.reverse(input);
        String expected = "";
        Assert.assertEquals(actual, expected);
    }
}
