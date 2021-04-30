package com.jalasoft.coding.jonathan;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseStringTest {
    @Test
    public void reverseSingleLetterTest() {
        String input = "A";
        String actual = ReverseString.reverse(input);
        String expected = "A";
        Assert.assertEquals(actual, expected);
    }
}
