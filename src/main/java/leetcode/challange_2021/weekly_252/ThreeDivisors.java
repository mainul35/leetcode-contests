package leetcode.challange_2021.weekly_252;

import java.util.HashSet;
import java.util.Set;

public class ThreeDivisors {
    public boolean isThree(int n) {
        Set<Integer> divisors = new HashSet<>();
        divisors.add(1);
        divisors.add(n);
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                divisors.add(i);
            }
        }
        return divisors.size() == 3;
    }
}
