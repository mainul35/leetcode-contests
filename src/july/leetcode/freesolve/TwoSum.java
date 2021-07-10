package july.leetcode.freesolve;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        var nums = new int[]{2,4,7,11,15};
        var target = 9;
//        [3,2,4]
//        6
//        var nums = new int[]{3,2,4};
//        var target = 6;

//        var nums = new int[]{3,3};
//        var target = 6;
        System.out.println(Arrays.toString(twoSumWithMap(nums, target)));
    }

    private static int[] twoSumWithMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[] {map.get(target - nums[i]), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }

    public static int[] twoSumBruteForce(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }
}