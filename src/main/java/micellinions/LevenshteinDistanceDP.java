package micellinions;

import java.util.Arrays;

public class LevenshteinDistanceDP {
    static boolean computeLevenshteinDistanceDP(String str1,
                                              String str2)
    {

        var diff = Math.abs (str1.length () - str2.length ());
        if (diff > 1) {
            return diff < 2;
        }

        // A 2-D matrix to store previously calculated
        // answers of subproblems in order
        // to obtain the final
        int[][] dp = new int[str1.length() + 1][str2.length() + 1];

        for (int i = 0; i <= str1.length(); i++)
        {
            for (int j = 0; j <= str2.length(); j++) {

                // If str1 is empty, all characters of
                // str2 are inserted into str1, which is of
                // the only possible method of conversion
                // with minimum operations.
                if (i == 0) {
                    dp[i][j] = j;
                }

                // If str2 is empty, all characters of str1
                // are removed, which is the only possible
                //  method of conversion with minimum
                //  operations.
                else if (j == 0) {
                    dp[i][j] = i;
                }

                else {
                    // find the minimum among three
                    // operations below


                    dp[i][j] = minm_edits(dp[i - 1][j - 1]
                                    + NumOfReplacement(str1.charAt(i - 1),str2.charAt(j - 1)), // replace
                            dp[i - 1][j] + 1, // delete
                            dp[i][j - 1] + 1); // insert
                }
            }
        }

        return dp[str1.length()][str2.length()] < 2;
    }

    // check for distinct characters
    // in str1 and str2

    static int NumOfReplacement(char c1, char c2)
    {
        return c1 == c2 ? 0 : 1;
    }

    // receives the count of different
    // operations performed and returns the
    // minimum value among them.

    static int minm_edits(int... nums)
    {

        return Arrays.stream(nums).min().orElse(
                Integer.MAX_VALUE);
    }

    // Driver Code
    public static void main(String args[])
    {

//        String s1 = "glomax";
        String s1 = "folmax";
        String s2 = "folmax";

        System.out.println(computeLevenshteinDistanceDP(s1, s2));
    }
}
