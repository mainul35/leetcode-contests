package july.leetcode.challange_2021.weekly_248;

import java.util.Arrays;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        int nums[] = new int[]{0,2,1,5,3,4};
        int[] nums2 = buildArray(nums);
        System.out.println(Arrays.toString(nums2));
    }

    public static int[] buildArray(int[] nums) {
        int[] nums2 = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            nums2[i] = nums[nums[i]];
        }
        return nums2;
    }
}
