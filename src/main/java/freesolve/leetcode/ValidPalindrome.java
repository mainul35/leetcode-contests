package freesolve.leetcode;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9$]", "");
        int begin = 0, end = s.length() - 1;
        while (begin < end) {
            if (s.charAt(begin) == s.charAt(end)) {
                begin++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }
}
