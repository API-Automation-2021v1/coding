package com.jalasoft.coding.jonas;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SpinWordsTests {
    /*
    * Test to spin the last two words.
     */
    @Test
    public void spinTheLastTwoWordsTest() {
        String input = "Hey fellow warriors";
        String actual = SpinWords.evaluate(input);
        String expected = "Hey wollef sroirraw";

        Assert.assertEquals(actual, expected);
    }

    /*
     * Test to spin any word.
     */
    @Test
    public void spinAnyWordTest() {
        String input = "This is a test";
        String actual = SpinWords.evaluate(input);
        String expected = "This is a test";

        Assert.assertEquals(actual, expected);
    }

    /*
     * Test to spin the third word.
     */
    @Test
    public void spinTheThirdWordTest() {
        String input = "This is another test";
        String actual = SpinWords.evaluate(input);
        String expected = "This is rehtona test";

        Assert.assertEquals(actual, expected);
    }

    /*
     * Test to spin all words.
     */
    @Test
    public void spinAllWordsTest() {
        String input = "Common example after reversing";
        String actual = SpinWords.evaluate(input);
        String expected = "nommoC elpmaxe retfa gnisrever";

        Assert.assertEquals(actual, expected);
    }
}
