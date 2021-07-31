package freesolve.leetcode;

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int currentSum = 0;
        while (left < right) {
            currentSum = numbers[left] + numbers[right];
            if (currentSum == target) {
                return new int[] {left+1, right+1};
            } else if (currentSum < target) {
                left += 1;
            } else {
                right -= 1;
            }
        }
        return new int[0];

    }
}
