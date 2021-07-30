package july.leetcode.challange_2021.weekly_249;

import java.util.HashSet;
import java.util.Set;

public class UniqueLength3PalindromicSubsequences {
    public static void main(String[] args) {
//        var s = "aabca";
//        var s = "bbcbaba";
        var s = "ckafnafqo";
        countPalindromicSubsequence(s);
    }

    public static int countPalindromicSubsequence(String s) {
        Set<String> set = new HashSet<>();
        boolean reached = false;
        int i = 0, j = i+1, k = s.length() - 1;
        while (i+2 <= k) {
            for (; j < k; j++) {
                if (s.charAt(i) == s.charAt(k)) {
                    set.add(""+s.charAt(i)+s.charAt(j)+s.charAt(k));
                }
            }

            if (i + 2 == k) {
                i = 0;
                reached = true;
            }
            if (reached) {
                k--;
            } else {
                i++;
            }
            j = i+1;
        }
//        System.out.println(set);
        return set.size();
    }
}
