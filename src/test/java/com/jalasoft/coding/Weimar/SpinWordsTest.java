package Weimar;

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
    public void test() {
        Assert.assertEquals("emocleW", new SpinWords().spinWords("Welcome"));
        Assert.assertEquals("Hey wollef sroirraw", new SpinWords().spinWords("Hey fellow warriors"));
    }
}
