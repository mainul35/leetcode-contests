package freesolve.leetcode;

public class MaximumSubarray {

    public static void main(String[] args) {
        System.out.println (maxSubArray (new int[]{-2,1,-3,4,-1,2,1,-5,4})); // 6
        System.out.println (maxSubArray (new int[]{1})); // 1
        System.out.println (maxSubArray (new int[]{5,4,-1,7,8})); // 23
    }

    /**
     * p1 = 0;
     * currentSum = nums[0]; maxSum = Integer.MIN_VALUE
     * i starts to move
     * currentSum = sum(p1...i)
     * if currentSum > maxSum then maxSum = currentSum
     * else p1 = i, currentSum = nums[i]
     * repeat
     * */
    public static int maxSubArray(int[] nums) {
        int currentSum = 0, maxSum = Integer.MIN_VALUE;
        for (int num : nums) {
            currentSum += num;
            if (currentSum >= maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }
}
