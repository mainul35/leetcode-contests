package freesolve.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNumberIII {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,1,3,2,5};
        System.out.println (Arrays.toString (singleNumber (nums)));
    }

    public static int[] singleNumber(int[] nums) {
        Map<Integer, Integer> memoize = new HashMap<> ();
        for (int i = 0; i < nums.length; i++) {
            if (!memoize.containsKey (nums[i])) {
                memoize.put (nums[i], 1);
            } else {
                memoize.put (nums[i], memoize.get (nums[i]) + 1);
            }
        }

        nums = new int[2];
        int c = 0;
        for (Map.Entry<Integer, Integer> entry : memoize.entrySet ()) {
            Integer integer = entry.getKey ();
            Integer integer2 = entry.getValue ();
            if (integer2 < 2 && c < 2) {
                nums[c] = integer;
                c++;
            }
        }
        return nums;
    }
}
