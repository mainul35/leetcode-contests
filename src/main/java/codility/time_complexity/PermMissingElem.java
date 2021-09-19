package codility.time_complexity;

import java.util.Arrays;

public class PermMissingElem {
    public static void main(String[] args) {
        int[] A = new int[]{2, 1, 3, 5};
        System.out.println (solution(A));
    }

    // This problem has strong corner cases
    // Solution 1: Naive, O(N) or O(N * log(N))
    public static int solution(int[] A) {
        Arrays.sort (A);
        // For empty array
        if (A.length == 0) return 1;

        // For only one element
        if (A[0] > 1) return A[0] - 1;
        if (A.length == 1 && A[0] == 1) return A[0] + 1;

        // For n elements
        for (int i = 1; i < A.length; i++) {
            if (A[i] - A[i-1] > 1) {
                return A[i] - 1;
            }
        }

        // If none is found within the array
        return A[A.length - 1] + 1;
    }
}
