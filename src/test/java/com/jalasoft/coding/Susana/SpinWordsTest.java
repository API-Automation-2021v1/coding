package com.jalasoft.coding.Susana;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Library test class.
 */
public class SpinWordsTest {

    /**
     * Verify some library method.
     */
    @Test
    public static void test1SpinWordsMethod() {
        String input = "Hey fellow warriors";
        String actual = ReverseString.reverse(input);
        String expected = "Hey wollef sroirraw";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public static void test2SpinWordsMethod() {
        String input = "This is a test";
        String actual = ReverseString.reverse(input);
        String expected = "This is a test";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public static void test3SpinWordsMethod() {
        String input = "This is another test";
        String actual = ReverseString.reverse(input);
        String expected = "This is rehtona test";
        Assert.assertEquals(actual, expected);
    }
}
