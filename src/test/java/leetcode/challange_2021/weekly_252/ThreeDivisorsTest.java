package leetcode.challange_2021.weekly_252;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ThreeDivisorsTest {

    ThreeDivisors threeDivisors = null;

    @BeforeEach
    void setUp() {
        threeDivisors = new ThreeDivisors();
    }

    @Test
    public void testWithSampleData1() {
        var result = threeDivisors.isThree(2);
        Assertions.assertFalse(result);
    }

    @Test
    public void testWithSampleData2() {
        var result = threeDivisors.isThree(4);
        Assertions.assertTrue(result);
    }

    @Test
    public void testWithCustomData3() {
        var result = threeDivisors.isThree(9);
        Assertions.assertTrue(result);
    }

    @Test
    public void testWithCustomData4() {
        var result = threeDivisors.isThree(12);
        Assertions.assertFalse(result);
    }

}
