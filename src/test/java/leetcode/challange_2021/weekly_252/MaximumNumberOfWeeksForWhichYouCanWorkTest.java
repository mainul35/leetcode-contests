package leetcode.challange_2021.weekly_252;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaximumNumberOfWeeksForWhichYouCanWorkTest {
    MaximumNumberOfWeeksForWhichYouCanWork maximumNumberOfWeeksForWhichYouCanWork = null;

    @BeforeEach
    void setUp() {
        maximumNumberOfWeeksForWhichYouCanWork = new MaximumNumberOfWeeksForWhichYouCanWork();
    }

    @Test
    public void testWithSampleData1() {
        var result = maximumNumberOfWeeksForWhichYouCanWork.numberOfWeeks(new int[]{4, 3, 2});
        Assertions.assertEquals(9, result);
    }

    @Test
    public void testWithSampleData2() {
        var result = maximumNumberOfWeeksForWhichYouCanWork.numberOfWeeks(new int[]{5, 2, 3, 4});
        Assertions.assertEquals(14, result);
    }

    @Test
    public void testWithCustomData3() {
        var result = maximumNumberOfWeeksForWhichYouCanWork.numberOfWeeks(new int[]{1,2,3});
        Assertions.assertEquals(6, result);
    }

    @Test
    public void testWithCustomData4() {
        var result = maximumNumberOfWeeksForWhichYouCanWork.numberOfWeeks(new int[]{5,2,1});
        Assertions.assertEquals(7, result);
    }

    @Test
    public void testWithCustomData5() {
        var result = maximumNumberOfWeeksForWhichYouCanWork.numberOfWeeks(new int[]{5,7,5,7,9,7});
        Assertions.assertEquals(40, result);
    }
}
