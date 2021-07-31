package freesolve.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ValidPalindromeTest {
    ValidPalindrome validPalindrome = null;
    @BeforeEach
    void setUp() {
        validPalindrome = new ValidPalindrome();
    }

    @Test
    public void testWithSampleData1() {
        String s = "A man, a plan, a canal: Panama";
        var result = validPalindrome.isPalindrome(s);
        Assertions.assertTrue(result);
    }

    @Test
    public void testWithSampleData2() {
        String s = "race a car";
        var result = validPalindrome.isPalindrome(s);
        Assertions.assertFalse(result);
    }

    @Test
    public void testWithCustomData3() {
        String s = "Madam";
        var result = validPalindrome.isPalindrome(s);
        Assertions.assertTrue(result);
    }

    @Test
    public void testWithCustomData4() {
        String s = "0P";
        var result = validPalindrome.isPalindrome(s);
        Assertions.assertFalse(result);
    }
}
