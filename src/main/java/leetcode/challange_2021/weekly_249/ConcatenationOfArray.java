package leetcode.challange_2021.weekly_249;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int nums[] = new int[]{1,3,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));;
    }

    /*public static int[] getConcatenation(int[] nums) {
        int copied[] = new int[nums.length*2];
        System.arraycopy(nums, 0, copied, 0, nums.length);
        System.arraycopy(nums, 0, copied, nums.length, nums.length);
        return copied;
    }*/

    public static int[] getConcatenation(int[] nums) {
        int[] ans = nums.clone();
        System.arraycopy(nums, 0, ans, 0, nums.length);
        return ans;
    }
}
