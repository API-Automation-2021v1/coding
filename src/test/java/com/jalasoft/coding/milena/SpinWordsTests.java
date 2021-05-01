package com.jalasoft.coding.milena;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 */

public class SpinWordsTests {
    /**
     * Test to spin empty string.
     */
    @Test
    public void spinWordsEmptyStringTest() {
        String input = "";
        String actual = SpinWords.spinWords(input);
        String expected = "";
        Assert.assertEquals(actual, expected);
    }


    /**
     * Test to spin is not executed with a word with a single letter.
     */

    @Test
    public void spinWordSingleLetterTest() {
        String input = "A";
        String actual = SpinWords.spinWords(input);
        String expected = "A";
        Assert.assertEquals(actual, expected);
    }

    /**
     * Test to spin is not executed with a word with two Characters
     */
    @Test
    public void spinWordOnlyTwoLetterTest() {
        String input = "Se";
        String actual = SpinWords.spinWords(input);
        String expected = "Se";
        Assert.assertEquals(actual, expected);
    }
    /**
     * Test to spin is not executed for a word less than 5 characters
     */
    @Test
    public void spinWordsSingleWordLessThan5Test() {
        String input = "Test";
        String actual = SpinWords.spinWords(input);
        String expected = "Test";
        Assert.assertEquals(actual, expected);
    }

    /**
     * Test to spin string with a word with more than 5 characters
     */
    @Test
    public void spinWordsSingleWordMoreThan5Test() {
        String input = "Follow";
        String actual = SpinWords.spinWords(input);
        String expected = "wolloF";
        Assert.assertEquals(actual, expected);
    }

    /**
     * Test to spin a phrase with multiple words string.
     */
    @Test
    public void spinWordsPhraseTest() {
        String input = "Hey fellow warriors";
        String actual = SpinWords.spinWords(input);
        String expected = "Hey wollef sroirraw";
        Assert.assertEquals(actual, expected);
    }
}