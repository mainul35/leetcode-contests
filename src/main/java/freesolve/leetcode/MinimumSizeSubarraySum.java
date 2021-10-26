package freesolve.leetcode;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        System.out.println (minSubArrayLen (7, new int[] {2,3,1,2,4,3}));
        System.out.println (minSubArrayLen (4, new int[] {1,4,4}));
        System.out.println (minSubArrayLen (11, new int[] {1,1,1,1,1,1,1,1}));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int currentSum = 0, subArrStart = 0, minSubArrayLength = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            while (currentSum >= target) {
                minSubArrayLength = Math.min (minSubArrayLength, i - subArrStart + 1);
                currentSum -= nums[subArrStart];
                subArrStart++;
            }
            if (currentSum == target) {
                minSubArrayLength = Math.min(minSubArrayLength,i-subArrStart+1);
            }
        }
        return minSubArrayLength == Integer.MAX_VALUE ? 0 : minSubArrayLength;
    }
}
